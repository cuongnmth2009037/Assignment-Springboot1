package com.example.assignmentspringboot1.service;

import com.example.assignmentspringboot1.entity.District;
import com.example.assignmentspringboot1.entity.Street;
import com.example.assignmentspringboot1.exception.NotFoundException;
import com.example.assignmentspringboot1.repository.DistrictsRepository;
import com.example.assignmentspringboot1.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    @Autowired
    DistrictsRepository districtRepository;
    @Autowired
    StreetRepository streetRepository;

    public Street save(Street street) {
        District district = (District) districtRepository.findById(street.getDistrict_id()).orElse(null);
        if (district == null) {
            throw new NotFoundException("No district found!");
        } else {
            street.setDistrict(district);
            streetRepository.save(street);
        }
        return street;
    }

    public List<Street> findAll() {
        return streetRepository.findAll();
    }
}
