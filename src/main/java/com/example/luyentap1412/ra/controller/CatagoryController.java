package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.service.catalog.CategoryRequestDto;
import com.example.luyentap1412.ra.service.catalog.CategoryResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatagoryController {
    @PostMapping("/add")
    public ResponseEntity<CategoryResponseDto> addCategory(
            @RequestBody CategoryRequestDto categoryRequestDto) {

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CategoryResponseDto> getCategory(@PathVariable Long id) {

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CategoryResponseDto>> getCategories() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CategoryResponseDto> deleteCategory(@PathVariable Long id) {

    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<CategoryResponseDto> editCategory(
            @RequestBody CategoryRequestDto categoryRequestDto,
            @PathVariable Long id) {

    }
}
