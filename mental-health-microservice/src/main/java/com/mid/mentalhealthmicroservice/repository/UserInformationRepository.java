package com.mid.mentalhealthmicroservice.repository;

import com.mid.mentalhealthmicroservice.entity.MentalExerciseEntity;
import com.mid.mentalhealthmicroservice.entity.UserInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformationEntity,Integer> {
}
