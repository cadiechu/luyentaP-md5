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
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CategoryResponseDto> getCategory(@PathVariable Long id) {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CategoryResponseDto>> getCategories() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CategoryResponseDto> deleteCategory(@PathVariable Long id) {
        Category category = categoryService.findById(id);
        categoryService.delete(category.getId());
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<CategoryResponseDto> editCategory(
            @RequestBody CategoryRequestDto categoryRequestDto,
            @PathVariable Long id) {
        category.setId(categoryService.findById(id).getId());
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }
}
