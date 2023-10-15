package com.example.microservice_from_zero.repository;

import com.example.microservice_from_zero.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CatRepository extends JpaRepository<Cat, UUID> {
}
