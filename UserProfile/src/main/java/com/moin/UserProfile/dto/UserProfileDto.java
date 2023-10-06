package com.moin.UserProfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDto {
    private String userID;
    private String name;
    private String email;
    private String gender;
    private Integer age;
    private String contactInfo;
    private String address;
}
