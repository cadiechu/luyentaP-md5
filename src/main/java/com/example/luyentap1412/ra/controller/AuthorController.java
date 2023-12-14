package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.model.Author;
import com.example.luyentap1412.ra.repository.IAuthorRepo;
import com.example.luyentap1412.ra.service.author.AuthorRequestDTO;
import com.example.luyentap1412.ra.service.author.AuthorResponseDTO;
import com.example.luyentap1412.ra.service.author.IAuthorService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/author")

public class AuthorController {
    @Autowired
    private IAuthorService authorService;
    private IAuthorRepo authorRepo;

    @PostMapping("/addAuthor")

    public ResponseEntity<AuthorRequestDTO> addAuthor(@RequestBody AuthorRequestDTO authorRequestDto) {
        //them moi author


    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AuthorResponseDTO> getAuthor(@PathVariable Long id) {

    }

    @GetMapping("/")
    public ResponseEntity<List<AuthorResponseDTO>> getAuthors() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AuthorResponseDTO> deleteAuthor(@PathVariable Long id) {

    }

    @PostMapping("/edit/{id}")
    private ResponseEntity<AuthorResponseDTO> editAuthor(@PathVariable Long id,
                                                         @RequestBody AuthorRequestDTO authorRequestDto) {
    }

    @PostMapping("/addZipcode/{zipcodeId}/to/{authorId}")
    private ResponseEntity<AuthorResponseDTO> addZipcode(@PathVariable Long zipcodeId,
                                                         @PathVariable Long authorId) {
    }

    @PostMapping("/removeZipcode/{id}")
    private ResponseEntity<AuthorResponseDTO> removeZipcode(@PathVariable Long id) {

    }

}
