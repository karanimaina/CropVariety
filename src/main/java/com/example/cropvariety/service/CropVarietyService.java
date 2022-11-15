package com.example.cropvariety.service;

import com.example.cropvariety.dto.CropVarietyDto;
import com.example.cropvariety.exception.CropVarietyException;
import com.example.cropvariety.model.CropVariety;
import com.example.cropvariety.repo.CropVarietyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CropVarietyService {
    private final CropVarietyRepository cropVarietyRepository;

    public CropVariety addCropVariety(CropVarietyDto cropVarietyDto){
    CropVariety cropVariety = cropVarietyRepository.findByCropId(cropVarietyDto.getCropId());
    if (cropVariety  == null){
        CropVariety cropVariety1 = new CropVariety();
        cropVariety1.setCropId(cropVarietyDto.getCropId());
        cropVariety1.setVarietyName(cropVarietyDto.getVarietyName());
        cropVariety1.setStatus(cropVarietyDto.getStatus());
        cropVarietyRepository.save(cropVariety1);
    }
    throw new CropVarietyException("crop already exist");
    }
}
