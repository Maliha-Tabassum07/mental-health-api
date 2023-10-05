package com.mid.maliha.nutritionmicroservice.repository;

import com.mid.maliha.nutritionmicroservice.entity.FoodInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodInformationRepository extends JpaRepository<FoodInformationEntity,Integer> {
}
