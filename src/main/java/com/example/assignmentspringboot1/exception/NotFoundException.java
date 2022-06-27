package com.example.assignmentspringboot1.exception;
    public class NotFoundException extends RuntimeException{
        public NotFoundException(String message) {
            super(message);
        }
}
