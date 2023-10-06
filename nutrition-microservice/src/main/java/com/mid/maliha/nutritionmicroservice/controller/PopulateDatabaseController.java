package com.mid.maliha.nutritionmicroservice.controller;

import com.mid.maliha.nutritionmicroservice.service.NutritionService;
import com.mid.maliha.nutritionmicroservice.service.PopulateDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/populate")
public class PopulateDatabaseController {
    @Autowired
    PopulateDatabaseService populateDatabaseService;

    @GetMapping("/food-information")
    public ResponseEntity<?> populateFood( ){
        populateDatabaseService.populateNutrition();
        return new ResponseEntity<>("Database populated", HttpStatus.ACCEPTED);
    }
}
