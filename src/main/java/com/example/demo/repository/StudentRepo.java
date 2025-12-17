package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Studentity;

public interface StudentRepo extends JpaRepository<Studentity, Integer> {
}
