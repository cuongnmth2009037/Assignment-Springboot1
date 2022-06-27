package com.example.assignmentspringboot1.repository;

import com.example.assignmentspringboot1.entity.Street;
import com.example.assignmentspringboot1.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {
}
