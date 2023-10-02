package com.mid.mentalhealthmicroservice.controller;

import com.mid.mentalhealthmicroservice.dto.QuestionsDTO;
import com.mid.mentalhealthmicroservice.service.MentalHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mental-health")
public class MentalHealthController {
    @Autowired
    MentalHealthService mentalHealthService;
    @PostMapping("survey/{userId}")
    public ResponseEntity<?> questions(@RequestBody QuestionsDTO questionsDTO){
        if (mentalHealthService.questions(questionsDTO)){
            return new ResponseEntity<String>("Thank you",HttpStatus.ACCEPTED );
        }
        return new ResponseEntity<String>("Wrong input",HttpStatus.BAD_REQUEST);
    }
}
