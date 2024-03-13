package com.example.ATCProject.exception;

public class StudentNotFoundException extends RuntimeException {
    private final String message;
    public StudentNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
