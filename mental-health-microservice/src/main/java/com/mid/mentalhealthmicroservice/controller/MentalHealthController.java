package com.mid.mentalhealthmicroservice.controller;

import com.mid.mentalhealthmicroservice.dto.MentalExerciseDTO;
import com.mid.mentalhealthmicroservice.dto.QuestionsDTO;
import com.mid.mentalhealthmicroservice.exception.ExerciseNotFound;
import com.mid.mentalhealthmicroservice.exception.UserNotFound;
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

    @PostMapping("exercise/create")
    public ResponseEntity<?> createExercise(@RequestBody MentalExerciseDTO mentalExerciseDTO){
        return new ResponseEntity<>(mentalHealthService.createMentalExercise(mentalExerciseDTO),HttpStatus.CREATED);
    }

    @GetMapping("/exercises/all")
    public ResponseEntity<?> allExercise(){
        return new ResponseEntity<>(mentalHealthService.getAllMentalExercise(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/search/{exercise}")
    public ResponseEntity<?> searchExercise(@PathVariable String exercise ) throws ExerciseNotFound {
        return new ResponseEntity<>(mentalHealthService.getMentalExercise(exercise),HttpStatus.ACCEPTED);
    }

    @PostMapping("survey/{userId}")
    public ResponseEntity<?> questions(@RequestBody QuestionsDTO questionsDTO, @PathVariable String userId){
        if (mentalHealthService.findMentalHealth(questionsDTO,userId)){
            return new ResponseEntity<>("Thank you",HttpStatus.ACCEPTED );
        }
        return new ResponseEntity<>("You already took the survey!",HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/exercises/{userId}")
    public ResponseEntity<?> userBasedExercise(@PathVariable String userId ) throws UserNotFound{
        return new ResponseEntity<>(mentalHealthService.getUserBasedMentalExercise(userId),HttpStatus.ACCEPTED);
    }

    @GetMapping("/recommendations/{userId}")
    public ResponseEntity<?> userBasedRecommendation(@PathVariable String userId ) throws UserNotFound {
        return new ResponseEntity<>(mentalHealthService.getUserBasedRecommendation(userId),HttpStatus.ACCEPTED);
    }

    @GetMapping("/email")
    public ResponseEntity<?> email(){
        return new ResponseEntity<>(mentalHealthService.getCurrentUser(),HttpStatus.OK);
    }

}
