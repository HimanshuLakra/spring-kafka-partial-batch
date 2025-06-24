package com.springkafka.example;

import com.springkafka.example.testConsumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAsync
public class SpringKafkaApplication {

    @Autowired
    private KafkaConsumer kafkaConsumer;

    public static void main(String[] args) {
  	    SpringApplication.run(SpringKafkaApplication.class, args);
    }

    @PostConstruct
    public void startConsumer()  {
        kafkaConsumer.initAndStart();
    }
}