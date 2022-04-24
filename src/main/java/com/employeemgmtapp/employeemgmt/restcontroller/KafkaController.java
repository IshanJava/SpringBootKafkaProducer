package com.employeemgmtapp.employeemgmt.restcontroller;

import com.employeemgmtapp.employeemgmt.entity.Employee;
import com.employeemgmtapp.employeemgmt.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/sendData")
    public String sendToKafka(@RequestBody Employee employee){
        kafkaService.sendDataToaKafka(employee);
        return"Success";
    }
}
