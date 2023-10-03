package com.mid.mentalhealthmicroservice.dto;

import java.util.List;

public class CategoryBasedExerciseDTO {
    private String category;
    private String duration;
    private List<String> exercise;
    public CategoryBasedExerciseDTO() {
    }

    public CategoryBasedExerciseDTO(String category, String duration, String Recommendation,List<String> exercise) {
        this.category = category;
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getExercise() {
        return exercise;
    }

    public void setExercise(List<String> exercise) {
        this.exercise = exercise;
    }
}
