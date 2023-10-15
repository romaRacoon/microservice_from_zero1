package com.example.microservice_from_zero.controller;

import com.example.microservice_from_zero.dto.CatDto;
import com.example.microservice_from_zero.entity.Cat;
import com.example.microservice_from_zero.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cat")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @GetMapping("/all")
    public ResponseEntity<List<Cat>> getAll() {
        return new ResponseEntity<>(catService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public void save(CatDto cat) {
        catService.save(cat);
    }
}
