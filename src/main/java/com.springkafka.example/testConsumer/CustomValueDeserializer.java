package com.springkafka.example.testConsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class CustomValueDeserializer implements Deserializer<Map<String, Object>> {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    static {
        OBJECT_MAPPER.findAndRegisterModules();
    }

    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    public Map<String, Object> deserialize(String topic, byte[] data) {
        try {
            return OBJECT_MAPPER.readValue(data, Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

