package com.mid.mentalhealthmicroservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mental_exercise")
public class MentalExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String exercise;
    private String description;

    public MentalExercise() {
    }

    public MentalExercise(Integer id, String exercise, String description) {
        this.id = id;
        this.exercise = exercise;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
