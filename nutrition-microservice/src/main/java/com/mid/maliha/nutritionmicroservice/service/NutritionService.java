package com.mid.maliha.nutritionmicroservice.service;

import com.mid.maliha.nutritionmicroservice.dto.FoodNutritionDTO;
import com.mid.maliha.nutritionmicroservice.dto.FoodRecipeDTO;
import com.mid.maliha.nutritionmicroservice.entity.FoodInformationEntity;
import com.mid.maliha.nutritionmicroservice.exception.FoodNotFound;
import com.mid.maliha.nutritionmicroservice.repository.FoodInformationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NutritionService {
    @Autowired
    FoodInformationRepository foodInformationRepository;

    public List<FoodRecipeDTO> getAllFoodRecipe(){
        List<FoodRecipeDTO> foodRecipeDTOList=new ArrayList<>();
        for(FoodInformationEntity foodInformationEntity:foodInformationRepository.findAll()){
            foodRecipeDTOList.add(new ModelMapper().map(foodInformationEntity,FoodRecipeDTO.class));
        }
        return foodRecipeDTOList.stream()
                .sorted(Comparator.comparing(FoodRecipeDTO::getFood))
                .collect(Collectors.toList());
    }

    public FoodRecipeDTO getFoodRecipe (String food) throws FoodNotFound {
        if(foodInformationRepository.existsByFood(food)){
            return new ModelMapper().map(foodInformationRepository.findByFood(food).orElseThrow(() -> new NullPointerException("No exercise")),FoodRecipeDTO.class);
        }
        throw new FoodNotFound();
    }
    public List<FoodNutritionDTO> getAllFoodNutrition(){
        List<FoodNutritionDTO> foodNutritionDTOList=new ArrayList<>();
        for(FoodInformationEntity foodInformationEntity:foodInformationRepository.findAll()){
            foodNutritionDTOList.add(new ModelMapper().map(foodInformationEntity, FoodNutritionDTO.class));
        }
        return foodNutritionDTOList.stream()
                .sorted(Comparator.comparing(FoodNutritionDTO::getFood))
                .collect(Collectors.toList());
    }
    public FoodNutritionDTO getFoodNutrition (String food) throws FoodNotFound {
        if(foodInformationRepository.existsByFood(food)){
            return new ModelMapper().map(foodInformationRepository.findByFood(food).orElseThrow(() -> new NullPointerException("No exercise")),FoodNutritionDTO.class);
        }
        throw new FoodNotFound();
    }
}
