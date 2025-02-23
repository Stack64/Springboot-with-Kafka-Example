package com.kafka_example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
    		topics="user-events",
    	    groupId = "groupId"
    )	
	void listener(String data) {
    	System.out.println("Listener recevied: " + data + " :) ");
	}
}
