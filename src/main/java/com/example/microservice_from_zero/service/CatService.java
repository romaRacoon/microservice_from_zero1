package com.example.microservice_from_zero.service;

import com.example.microservice_from_zero.dto.CatDto;
import com.example.microservice_from_zero.entity.Cat;
import com.example.microservice_from_zero.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public List<Cat> getAll() {
        return catRepository.findAll();
    }

    public void save(CatDto catDto) {
        Cat cat = new Cat();
        cat.setName(catDto.getName());
        cat.setBirthDate(catDto.getBirthDate());
        cat.setCreatedAt(catDto.getCreatedAt());
        catRepository.save(cat);
    }
}
