package com.example.cropvariety.exception;

import com.example.cropvariety.commons.UniversalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class handler {
    @ExceptionHandler(CropVarietyException.class)
    ResponseEntity<UniversalResponse>

}
