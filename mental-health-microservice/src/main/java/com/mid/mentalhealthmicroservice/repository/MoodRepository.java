package com.mid.mentalhealthmicroservice.repository;

import com.mid.mentalhealthmicroservice.entity.MoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoodRepository extends JpaRepository<MoodEntity,Integer> {
    Boolean existsByUserId(String userId);
    List<MoodEntity> findAllByUserId(String userId);
}
