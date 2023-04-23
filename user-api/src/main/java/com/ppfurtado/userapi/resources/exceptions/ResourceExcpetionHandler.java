package com.ppfurtado.userapi.resources.exceptions;

import com.ppfurtado.userapi.services.excpetions.ObjectNotFoundExcpetion;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExcpetionHandler {

    @ExceptionHandler(ObjectNotFoundExcpetion.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExcpetion ex, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new StandardError(LocalDateTime.now(), ex.getMessage(), HttpStatus.NOT_FOUND.value(), request.getRequestURI())
        );
    }
}
