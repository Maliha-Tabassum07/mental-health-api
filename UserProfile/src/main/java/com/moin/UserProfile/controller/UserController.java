package com.moin.UserProfile.controller;
import com.moin.UserProfile.dto.*;
import com.moin.UserProfile.model.UserRegistrationResponse;
import com.moin.UserProfile.service.serviceImplementation.UserServiceImplementation;
import com.moin.UserProfile.utilities.JWTUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserServiceImplementation userService;


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto userDto) throws Exception {
        try {
            UserDto createdUser = userService.createUser(userDto);
            List<String> roles = new ArrayList<String>();
            roles.add("ROLE_" + createdUser.getRole());

            String accessToken = JWTUtils.generateToken(createdUser.getEmail(), roles);
            UserRegistrationResponse response = new UserRegistrationResponse(createdUser, accessToken);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }



    @PostMapping("/createProfile")
    public ResponseEntity<UserProfileDto> createUserProfile(@RequestBody UserProfileDto userProfileDto){
            UserProfileDto userProfile = userService.createUserProfile(userProfileDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(userProfile);
    }

    @GetMapping("/getProfileById")
    public ResponseEntity<UserProfileDto> getUserProfileById(){
        UserProfileDto userProfile = userService.getUserProfileDataById();
        return ResponseEntity.status(HttpStatus.OK).body(userProfile);
    }

    @PutMapping("/updateUserProfile")
    public ResponseEntity<UserProfileDto> updateUserProfile(@RequestBody UserProfileDto userProfileDto){
        UserProfileDto userProfile = userService.updateUserProfile(userProfileDto);
        return ResponseEntity.status(HttpStatus.OK).body(userProfile);
    }

    @GetMapping("/health-data")
    public SendHealthDataDto sendHealthData(){
        return userService.sendHealthData();
    }
//    @GetMapping("/profile")
//    public ResponseEntity<List<UserProfileEntity>> getAllUserProfile(){
//        List<UserProfileEntity> userProfile = userService.getAllUsersProfile();
//        return ResponseEntity.status(HttpStatus.OK).body(userProfile);
//    }

    @PostMapping("/createHealthDAta")
    public ResponseEntity<HealthDataDto> createHealthData(@RequestBody HealthDataDto healthDataDto){
        HealthDataDto healthData = userService.createHealthData(healthDataDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(healthData);
    }

    @GetMapping("/getHealthDataById")
    public ResponseEntity<HealthDataDto> getUserHealthDataById(){
        HealthDataDto healthData = userService.getUserHealthDataById();
        return ResponseEntity.status(HttpStatus.OK).body(healthData);
    }

    @PutMapping("/updateUserHealthData")
    public void updateUserHealthData(@RequestBody HealthDataDto healthDataDto){
        userService.updateUserHealthData(healthDataDto);
    }
    @GetMapping("/getUserByEmail")
    public UserDto getUserByEmail(@RequestParam("email") String email){
        return userService.getUserByEmail(email);
    }
}
