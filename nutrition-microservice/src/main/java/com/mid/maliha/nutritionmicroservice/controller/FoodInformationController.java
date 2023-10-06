package com.mid.maliha.nutritionmicroservice.controller;

import com.mid.maliha.nutritionmicroservice.exception.FoodNotFound;
import com.mid.maliha.nutritionmicroservice.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nutrition")
public class FoodInformationController {
    @Autowired
    NutritionService nutritionService;

    @GetMapping("/recipe/all")
    public ResponseEntity<?> allFoodRecipe(){
        return new ResponseEntity<>(nutritionService.getAllFoodRecipe(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/search/{food}")
    public ResponseEntity<?> searchFoodRecipe(@PathVariable String food ) throws FoodNotFound {
        return new ResponseEntity<>(nutritionService.getFoodRecipe(food),HttpStatus.ACCEPTED);
    }

    @GetMapping("/food-nutrition/all")
    public ResponseEntity<?> allFoodNutrition(){
        return new ResponseEntity<>(nutritionService.getAllFoodNutrition(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/food-nutrition/{food}")
    public ResponseEntity<?> searchFoodNutrition(@PathVariable String food ) throws FoodNotFound {
        return new ResponseEntity<>(nutritionService.getFoodNutrition(food),HttpStatus.ACCEPTED);
    }
}
