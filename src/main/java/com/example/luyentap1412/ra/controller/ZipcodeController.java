package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.model.Zipcode;
import com.example.luyentap1412.ra.service.zipcode.ZipcodeRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zip")
public class ZipcodeController {

    @PostMapping("/add")
    public ResponseEntity<Zipcode> addZipcode(@RequestBody ZipcodeRequestDto zipcodeRequestDto) {

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Zipcode> getZipcode(@PathVariable Long id) {

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Zipcode>> getZipcodes() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Zipcode> deleteZipcode(@PathVariable  Long id) {

    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Zipcode> editZipcode(@RequestBody  ZipcodeRequestDto zipcodeRequestDto,
                                               @PathVariable  Long id) {

    }

    @PostMapping("/addCity/{cityId}/toZipcode/{zipcodeId}")
    public ResponseEntity<Zipcode> addCity(@PathVariable  Long cityId,
                                           @PathVariable  Long zipcodeId) {

    }

    @PostMapping("/deleteCity/{zipcodeId}")
    public ResponseEntity<Zipcode> deleteCity(@PathVariable  Long zipcodeId) {

    }
}
