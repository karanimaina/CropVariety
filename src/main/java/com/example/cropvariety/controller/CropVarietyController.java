package com.example.cropvariety.controller;

import com.example.cropvariety.commons.UniversalResponse;
import com.example.cropvariety.dto.CropVarietyDto;
import com.example.cropvariety.model.CropVariety;
import com.example.cropvariety.repo.CropVarietyRepository;
import com.example.cropvariety.service.CropVarietyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CropVarietyController {
    private final CropVarietyService cropVarietyService;
    @PostMapping("/add/crop")
     ResponseEntity<UniversalResponse>addCrop(@RequestBody CropVarietyDto cropVarietyDto){
        CropVariety cropVariety = cropVarietyService.addCropVariety(cropVarietyDto);
        return ResponseEntity.ok().body(UniversalResponse.builder().status(200).message("crop added").data(cropVariety).build());
     }
     ResponseEntity<UniversalResponse> editCrop(long id, CropVarietyDto cropVarietyDto){
        CropVariety cropVariety  = cropVarietyService.editCropVariety(id,cropVarietyDto);
         return ResponseEntity.ok().body(UniversalResponse.builder().status(200).message("crop added").data(cropVariety).build());
     }
}
