package com.mid.mentalhealthmicroservice.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user_information")
public class UserInformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private String mentalHealthCategory;
    public UserInformationEntity() {
    }

    public UserInformationEntity(Integer id, Integer userId, String mood, String mentalHealthCategory, LocalDate currentDate) {
        this.id = id;
        this.userId = userId;
        this.mentalHealthCategory = mentalHealthCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getMentalHealthCategory() {
        return mentalHealthCategory;
    }

    public void setMentalHealthCategory(String mentalHealthCategory) {
        this.mentalHealthCategory = mentalHealthCategory;
    }

}
