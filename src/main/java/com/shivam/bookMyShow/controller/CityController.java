package com.shivam.bookMyShow.controller;

import com.shivam.bookMyShow.dto.response.CityDto;
import com.shivam.bookMyShow.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    // ADMIN — create a city
    @PostMapping("/admin/cities")
    public ResponseEntity<CityDto> createCity(@RequestParam String name) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cityService.createCity(name));
    }

    // PUBLIC — get all cities
    @GetMapping("/cities")
    public ResponseEntity<List<CityDto>> getAllCities() {
        return ResponseEntity.ok(cityService.getAllCities());
    }
}