package com.example.cropvariety.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CropVarietyRepository extends JpaRepository<CropVariety ,Long> {
    CropVariety  findByCropId(long id);
}
