package com.mid.maliha.nutritionmicroservice.service;

import com.mid.maliha.nutritionmicroservice.entity.FoodInformationEntity;
import com.mid.maliha.nutritionmicroservice.repository.FoodInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopulateDatabaseService {
    @Autowired
    FoodInformationRepository foodInformationRepository;

    public void populateNutrition(){

        FoodInformationEntity foodInformationEntity1=new FoodInformationEntity();
        foodInformationEntity1.setFood("Bread");
        foodInformationEntity1.setRecipe("Baked using wheat flour");
        foodInformationEntity1.setNutritionalFact("Contains Carbohydrate");
        foodInformationEntity1.setCaloriePerServing(70);
        foodInformationEntity1.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity1);

        FoodInformationEntity foodInformationEntity2=new FoodInformationEntity();
        foodInformationEntity2.setFood("Rice");
        foodInformationEntity2.setRecipe("Boiled rice");
        foodInformationEntity2.setNutritionalFact("Contains Carbohydrate");
        foodInformationEntity2.setCaloriePerServing(210);
        foodInformationEntity2.setServing("1 cup");
        foodInformationRepository.save(foodInformationEntity2);

        FoodInformationEntity foodInformationEntity3=new FoodInformationEntity();
        foodInformationEntity3.setFood("Egg(Omelet)");
        foodInformationEntity3.setRecipe("Egg fried in oil");
        foodInformationEntity3.setNutritionalFact("High content of protein and fat. Contains vitamins and minerals");
        foodInformationEntity3.setCaloriePerServing(150);
        foodInformationEntity3.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity3);

        FoodInformationEntity foodInformationEntity4=new FoodInformationEntity();
        foodInformationEntity4.setFood("Egg(Boiled)");
        foodInformationEntity4.setRecipe("Boiled in water");
        foodInformationEntity4.setNutritionalFact("High content of protein and fat. Contains vitamins and minerals");
        foodInformationEntity4.setCaloriePerServing(68);
        foodInformationEntity4.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity4);

        FoodInformationEntity foodInformationEntity5=new FoodInformationEntity();
        foodInformationEntity5.setFood("Vegetable curry");
        foodInformationEntity5.setRecipe("Take seasonal vegetables and cook them with spices");
        foodInformationEntity5.setNutritionalFact("Rich in vitamins and minerals");
        foodInformationEntity5.setCaloriePerServing(180);
        foodInformationEntity5.setServing("1 cup");
        foodInformationRepository.save(foodInformationEntity5);

        FoodInformationEntity foodInformationEntity6=new FoodInformationEntity();
        foodInformationEntity6.setFood("Chicken Fry");
        foodInformationEntity6.setRecipe("Coat the chicken in batter using spices. Then fry them in oil");
        foodInformationEntity6.setNutritionalFact("High content of fat and protein. Have no dietary fiber");
        foodInformationEntity6.setCaloriePerServing(200);
        foodInformationEntity6.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity6);

        FoodInformationEntity foodInformationEntity7=new FoodInformationEntity();
        foodInformationEntity7.setFood("Chicken Curry");
        foodInformationEntity7.setRecipe("Cook the chicken in spices. ");
        foodInformationEntity7.setNutritionalFact("High content of protein.");
        foodInformationEntity7.setCaloriePerServing(150);
        foodInformationEntity7.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity7);

        FoodInformationEntity foodInformationEntity8=new FoodInformationEntity();
        foodInformationEntity8.setFood("Fish fry");
        foodInformationEntity8.setRecipe("Marinate the fish in spices and fry it in oil");
        foodInformationEntity8.setNutritionalFact("High in protein, fat, vitamins and");
        foodInformationEntity8.setCaloriePerServing(250);
        foodInformationEntity8.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity8);

        FoodInformationEntity foodInformationEntity9=new FoodInformationEntity();
        foodInformationEntity9.setFood("Fish curry");
        foodInformationEntity9.setRecipe("Cook the fish in spices");
        foodInformationEntity9.setNutritionalFact("High content of protein, vitamins and minerals");
        foodInformationEntity9.setCaloriePerServing(150);
        foodInformationEntity9.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity9);

        FoodInformationEntity foodInformationEntity10=new FoodInformationEntity();
        foodInformationEntity10.setFood("Prawn curry");
        foodInformationEntity10.setRecipe("Cook the prawn in spices");
        foodInformationEntity10.setNutritionalFact("High content of protein,vitamins");
        foodInformationEntity10.setCaloriePerServing(200);
        foodInformationEntity10.setServing("1 cup");
        foodInformationRepository.save(foodInformationEntity10);

        FoodInformationEntity foodInformationEntity11=new FoodInformationEntity();
        foodInformationEntity11.setFood("Beef curry");
        foodInformationEntity11.setRecipe("Cook the beef in spices");
        foodInformationEntity11.setNutritionalFact("High content of fat and protein");
        foodInformationEntity11.setCaloriePerServing(300);
        foodInformationEntity11.setServing("1 cup");
        foodInformationRepository.save(foodInformationEntity11);

        FoodInformationEntity foodInformationEntity12=new FoodInformationEntity();
        foodInformationEntity12.setFood("French fry");
        foodInformationEntity12.setRecipe("Cut potatoes and fry them in oil with salt and pepper");
        foodInformationEntity12.setNutritionalFact("High content of carb and fat");
        foodInformationEntity12.setCaloriePerServing(200);
        foodInformationEntity12.setServing("85 gm");
        foodInformationRepository.save(foodInformationEntity12);

        FoodInformationEntity foodInformationEntity13=new FoodInformationEntity();
        foodInformationEntity13.setFood("Cake");
        foodInformationEntity13.setRecipe("Bake the cake with wheat flour, sugar, egg and baking soda");
        foodInformationEntity13.setNutritionalFact("High content of carb and sugar");
        foodInformationEntity13.setCaloriePerServing(250);
        foodInformationEntity13.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity13);

        FoodInformationEntity foodInformationEntity14=new FoodInformationEntity();
        foodInformationEntity14.setFood("Fruit Juice");
        foodInformationEntity14.setRecipe("Blend the fruits and add sugar if you want");
        foodInformationEntity14.setNutritionalFact("High content of carb, vitamins and sugar");
        foodInformationEntity14.setCaloriePerServing(130);
        foodInformationEntity14.setServing("1 cup");
        foodInformationRepository.save(foodInformationEntity14);

        FoodInformationEntity foodInformationEntity15=new FoodInformationEntity();
        foodInformationEntity15.setFood("Fruits");
        foodInformationEntity15.setRecipe("Apple, banana, mango ");
        foodInformationEntity15.setNutritionalFact("Contains carbs and vitamins");
        foodInformationEntity15.setCaloriePerServing(100);
        foodInformationEntity15.setServing("1 piece");
        foodInformationRepository.save(foodInformationEntity15);

    }
}
