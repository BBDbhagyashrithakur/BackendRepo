package com.example.ATCProject.exception;
public class UserAlreadyExist extends RuntimeException {
    private String message;
    public UserAlreadyExist(String message) {
        super(message);
        this.message = message;
    }
    public UserAlreadyExist() {
    }
}