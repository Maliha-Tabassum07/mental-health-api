package com.mid.maliha.nutritionmicroservice.controller;

import com.mid.maliha.nutritionmicroservice.dto.FoodRecipeDTO;
import com.mid.maliha.nutritionmicroservice.dto.MedicalConditionDTO;
import com.mid.maliha.nutritionmicroservice.exception.FoodNotFound;
import com.mid.maliha.nutritionmicroservice.exception.UserNotFound;
import com.mid.maliha.nutritionmicroservice.exception.WrongInput;
import com.mid.maliha.nutritionmicroservice.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nutrition")
public class FoodInformationController {
    @Autowired
    private NutritionService nutritionService;

    @GetMapping("/recipe/all")
    public ResponseEntity<?> allFoodRecipe(){
        return new ResponseEntity<>(nutritionService.getAllFoodRecipe(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/recipe/{food}")
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
    @PutMapping("recipe/update/{recipeId}")
    public ResponseEntity<?> updateRecipe(@PathVariable Integer recipeId,@RequestBody FoodRecipeDTO foodRecipeDTO)throws FoodNotFound{
        return new ResponseEntity<>(nutritionService.updateFoodRecipe(recipeId,foodRecipeDTO),HttpStatus.CREATED);
    }

    @PostMapping("/user/survey")
    public ResponseEntity<?> setUserInfo(@RequestBody MedicalConditionDTO medicalConditionDTO)throws WrongInput {
        if (nutritionService.setCategory(medicalConditionDTO)){
            return new ResponseEntity<>("Thank you",HttpStatus.ACCEPTED );
        }else{
            return new ResponseEntity<>("You already given information!",HttpStatus.BAD_REQUEST);}
    }
    @GetMapping("/user/recommendations")
    public ResponseEntity<?> getRecommendation()throws UserNotFound {
        return new ResponseEntity<>(nutritionService.categoryBasedRecommendation(),HttpStatus.ACCEPTED);
    }
//include in feign client
    @GetMapping("/search-foodId/{foodId}")
    public ResponseEntity<?> searchFoodNutritionById(@PathVariable Integer foodId ) throws FoodNotFound {
        return new ResponseEntity<>(nutritionService.getFoodNutritionById(foodId),HttpStatus.ACCEPTED);
    }
//include in feign client
        @GetMapping("/search/{category}")
    public ResponseEntity<?> searchFoodNutritionById(@PathVariable String category ) throws FoodNotFound {
        return new ResponseEntity<>(nutritionService.categoryBasedNutrition(category),HttpStatus.ACCEPTED);
    }
//include in feign client
    @GetMapping("/search-categoryId/{categoryId}")
    public ResponseEntity<?> searchCategoryBasedMenuById(@PathVariable Integer categoryId ) throws FoodNotFound {
        return new ResponseEntity<>(nutritionService.categoryBasedMenu(categoryId),HttpStatus.ACCEPTED);
    }


}
