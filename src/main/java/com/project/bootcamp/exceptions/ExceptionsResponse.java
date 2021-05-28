package com.project.bootcamp.exceptions;

public class ExceptionsResponse {

    private String message;

    ExceptionsResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
