package com.example.cropvariety.dto;

import com.example.cropvariety.status.Status;
import lombok.Data;

import javax.persistence.*;
@Data
public class CropVarietyDto {
    private long cropId;
    private String varietyName;
    private Status status;


}
