package com.example.assignmentspringboot1.service;

import com.example.assignmentspringboot1.entity.District;
import com.example.assignmentspringboot1.repository.DistrictsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictsService {
    @Autowired
    private DistrictsRepository districtsRepository;

    public List<District> findAll() {
        return districtsRepository.findAll();
    }

    public District save(District districts) {
        return districtsRepository.save(districts);
    }
}
