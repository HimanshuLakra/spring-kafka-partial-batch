package com.springkafka.example.testConsumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties.AckMode;
import org.springframework.kafka.support.LogIfLevelEnabled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class KafkaConsumer {

    public void initAndStart() {
        ConcurrentMessageListenerContainer<String, String> container = getMessageListenerContainer();
        container.start();
    }

    private ConcurrentMessageListenerContainer<String, String> getMessageListenerContainer(){
        Map<String, Object> configs = new HashMap<>();

        // Set your kafka configs
        configs.put("ssl.protocol", "");
        configs.put("ssl.enabled.protocols", "");
        configs.put("security.protocol", "");
        configs.put("sasl.mechanism", "");
        configs.put("sasl.jaas.config", "");
        configs.put("sasl.login.callback.handler.class", "");
        configs.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "<set-your-bootstrap-servers>");
        configs.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "3");
        configs.put(ConsumerConfig.CLIENT_ID_CONFIG, "<client-id>");
        configs.put(ConsumerConfig.GROUP_ID_CONFIG, "testing-group");
        configs.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        configs.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configs.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CustomValueDeserializer.class);
        configs.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        configs.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "120000");
        ConcurrentKafkaListenerContainerFactory<String, String> containerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        containerFactory.setConsumerFactory(new DefaultKafkaConsumerFactory(configs));
        ConcurrentMessageListenerContainer<String, String> container = containerFactory.createContainer("test-topic");
        container.getContainerProperties().setMessageListener(new BatchManualModeListener());
        container.getContainerProperties().setCommitLogLevel(LogIfLevelEnabled.Level.INFO);
        container.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
        container.setConcurrency(1);
        container.setBeanName("test_listener");
        return container;
    }
}
