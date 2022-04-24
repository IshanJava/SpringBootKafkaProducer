package com.employeemgmtapp.employeemgmt.service;

import com.employeemgmtapp.employeemgmt.entity.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Value("${topic.value}")
    String topic;

    public void sendDataToaKafka(Employee employee){
        try {
            kafkaTemplate.send(topic, new ObjectMapper().writeValueAsString(employee));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
