package com.example.cropvariety.commons;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UniversalResponse {
    private int status;
    private String message;
    private Object data;
}
