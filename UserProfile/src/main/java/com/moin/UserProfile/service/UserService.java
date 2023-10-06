package com.moin.UserProfile.service;

import com.moin.UserProfile.dto.*;
import com.moin.UserProfile.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDto createUser(UserDto user) throws Exception;
    UserDto getUser(String email);
    UserProfileDto createUserProfile(UserProfileDto userProfileDto);
    //List<UserProfileEntity> getAllUsersProfile();
    UserProfileDto getUserProfileDataById();

    UserProfileDto updateUserProfile(UserProfileDto userProfileDto);

    SendHealthDataDto sendHealthData();
    HealthDataDto createHealthData(HealthDataDto healthDataDto);
    //HealthDataEntity getHealthDataById(Long HealthDataId);
    UserEntity readByEmail(String email);

    HealthDataDto getUserHealthDataById();

    HealthDataDto updateUserHealthData(HealthDataDto healthDataDto);

    UserDto getUserByEmail(String userEmail);

}
