package com.example.cropvariety.model;

import com.example.cropvariety.status.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CropVariety {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long cropId;
    private String varietyName;
    @Enumerated(EnumType.STRING)
    private Status status;












}
