package com.example.cropvariety.repo;

import com.example.cropvariety.model.CropVariety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropVarietyRepository extends JpaRepository<CropVariety,Long> {
    CropVariety  findByCropId(long id);
}
