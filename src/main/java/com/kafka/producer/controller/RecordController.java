package com.kafka.producer.controller;

import com.kafka.producer.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RecordController {

    private final  RecordService recordService;

    public RecordController(RecordService recordService){
        this.recordService=recordService;
    }

    @GetMapping(value = "/records")
    public ResponseEntity getAllRecords(){
        return new ResponseEntity(recordService.getAllRecords(), HttpStatus.OK);
    }
}
