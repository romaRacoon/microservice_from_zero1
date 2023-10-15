package com.example.microservice_from_zero.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class CatDto {
    private String name;
    private LocalDate birthDate;
    private LocalDateTime createdAt;
}
