package com.example.assignmentspringboot1.restapi;

import com.example.assignmentspringboot1.entity.District;
import com.example.assignmentspringboot1.service.DistrictsService;
import com.example.assignmentspringboot1.entity.District;
import com.example.assignmentspringboot1.service.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/district")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class DistrictsApi {
    @Autowired
    DistrictsService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<District>> getList() {
        return ResponseEntity.ok(districtService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<District> create(@RequestBody District district) {
        return ResponseEntity.ok(districtService.save(district));
    }
}
