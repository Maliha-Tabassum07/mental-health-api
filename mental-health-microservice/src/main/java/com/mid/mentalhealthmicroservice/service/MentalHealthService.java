package com.mid.mentalhealthmicroservice.service;

import com.mid.mentalhealthmicroservice.dto.QuestionsDTO;
import org.springframework.stereotype.Service;

@Service
public class MentalHealthService {

    public Boolean questions(QuestionsDTO questionsDTO){
        if(questionsDTO.getSleep()==0&&questionsDTO.getStress()==0&&questionsDTO.getAnxiety()==0){

        }
        return true;
    }
}
