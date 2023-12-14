package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.model.City;
import com.example.luyentap1412.ra.service.city.CityRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @PostMapping("/add")
    public ResponseEntity<City> addCity(@RequestBody CityRequestDto cityRequestDto) {

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) {

    }

    @GetMapping("/getall")
    public ResponseEntity<List<City>> getCities() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<City> deleteCity(@PathVariable  Long id) {

    }

    @PostMapping("/edit/id")
    public ResponseEntity<City> editCity(@RequestBody  CityRequestDto cityRequestDto,
                                         @PathVariable  Long id) {

    }

}
