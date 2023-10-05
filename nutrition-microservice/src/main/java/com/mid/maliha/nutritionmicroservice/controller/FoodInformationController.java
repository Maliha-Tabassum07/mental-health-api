package com.mid.maliha.nutritionmicroservice.controller;

import com.mid.maliha.nutritionmicroservice.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nutrition")
public class FoodInformationController {
    @Autowired
    NutritionService nutritionService;

    @GetMapping("/populate")
    public ResponseEntity<?> populateFood( ){
        nutritionService.populateNutrition();
        return new ResponseEntity<>("Database populated", HttpStatus.ACCEPTED);
    }

}
