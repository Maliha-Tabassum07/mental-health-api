package com.mid.mentalhealthmicroservice.controller;

import com.mid.mentalhealthmicroservice.dto.MentalExerciseDTO;
import com.mid.mentalhealthmicroservice.dto.QuestionsDTO;
import com.mid.mentalhealthmicroservice.service.MentalHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mental-health")
public class MentalHealthController {
    @Autowired
    MentalHealthService mentalHealthService;

    @GetMapping("/populate/exercise")
    public ResponseEntity<?> populateExercise( ){
        mentalHealthService.populateExercise();
        return new ResponseEntity<>("Database populated",HttpStatus.ACCEPTED);
    }
    @GetMapping("/populate/category")
    public ResponseEntity<?> populateCategory(){
        mentalHealthService.populateCategory();
        return new ResponseEntity<>("Database populated",HttpStatus.ACCEPTED);
    }
    @PostMapping("exercise/create")
    public ResponseEntity<?> createExercise(@RequestBody MentalExerciseDTO mentalExerciseDTO){
        return new ResponseEntity<>(mentalHealthService.createMentalExercise(mentalExerciseDTO),HttpStatus.CREATED);
    }

    @GetMapping("/exercises/all")
    public ResponseEntity<?> allExercise(){
        return new ResponseEntity<>(mentalHealthService.getAllMentalExercise(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/search/{exercise}")
    public ResponseEntity<?> searchExercise(@PathVariable String exercise ){
        return new ResponseEntity<>(mentalHealthService.getMentalExercise(exercise),HttpStatus.ACCEPTED);
    }

    @PostMapping("survey/{userId}")
    public ResponseEntity<?> questions(@RequestBody QuestionsDTO questionsDTO, @PathVariable Integer userId){
        if (mentalHealthService.findMentalHealth(questionsDTO,userId)){
            return new ResponseEntity<>("Thank you",HttpStatus.ACCEPTED );
        }
        return new ResponseEntity<>("Wrong input",HttpStatus.BAD_REQUEST);
    }

}
