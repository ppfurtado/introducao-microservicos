package com.ppfurtado.userapi.services.excpetions;

public class ObjectNotFoundExcpetion extends RuntimeException {

    public ObjectNotFoundExcpetion(String message) {
        super(message);
    }
}
