package com.mid.maliha.nutritionmicroservice.exception;

public class UserNotFound extends Exception{
    private static final String MESSAGE = "Give your information to get this!";

    public UserNotFound() {
        super(MESSAGE);
    }

    public UserNotFound(String message) {
        super(message);
    }
}
