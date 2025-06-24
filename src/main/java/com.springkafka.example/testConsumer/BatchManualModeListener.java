package com.springkafka.example.testConsumer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.BatchAcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.util.CollectionUtils;

import java.util.*;

public class BatchManualModeListener implements BatchAcknowledgingMessageListener<String, Object>  {

    private static final Logger logger = LoggerFactory.getLogger(BatchManualModeListener.class);

    public BatchManualModeListener() {
    }

    @Override
    public void onMessage(List<ConsumerRecord<String, Object>> data, Acknowledgment acknowledgment) {

        if(CollectionUtils.isEmpty(data)) {
            return;
        }

        String batchId = UUID.randomUUID().toString();
        for (ConsumerRecord<String, Object> record : data) {
            logger.info("Message Received with BatchId: {}, Offset: {}, Partition: {}", batchId, record.offset(), record.partition());
        }

        acknowledgment.acknowledge(0);
    }
}