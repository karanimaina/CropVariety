package com.example.cropvariety.controller;

import com.example.cropvariety.repo.CropVarietyRepository;
import com.example.cropvariety.service.CropVarietyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CropVarietyController {
    private final CropVarietyService cropVarietyService
}
