package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.model.Author;
import com.example.luyentap1412.ra.repository.IAuthorRepo;
import com.example.luyentap1412.ra.service.author.AuthorRequestDTO;
import com.example.luyentap1412.ra.service.author.AuthorResponseDTO;
import com.example.luyentap1412.ra.service.author.IAuthorService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        AuthorResponseDTO response = authorService.addAuthor(authorRequestDto); // Gọi service để thêm tác giả mới
        if (response != null) {
            return new ResponseEntity<>(authorRequestDto, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AuthorResponseDTO> getAuthor(@PathVariable Long id) {

    }

    @GetMapping("/")
    public ResponseEntity<List<AuthorResponseDTO>> getAuthors() {
        return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AuthorResponseDTO> deleteAuthor(@PathVariable Long id) {
        public ResponseEntity<Author> deleteAuthor(@PathVariable Long id) throws NotFoundException {
            Author author = authorService.findById(id);
            authorService.delete(author.getId());
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
    }

    @PostMapping("/edit/{id}")
    private ResponseEntity<AuthorResponseDTO> editAuthor(@PathVariable Long id,
                                                         @RequestBody AuthorRequestDTO authorRequestDto) {
        author.setId(authorService.findById(id).getId());
        return new ResponseEntity<>(authorService.save(author), HttpStatus.OK);
    }

    @PostMapping("/addZipcode/{zipcodeId}/to/{authorId}")
    private ResponseEntity<AuthorResponseDTO> addZipcode(@PathVariable Long zipcodeId,
                                                         @PathVariable Long authorId) {
    }

    @PostMapping("/removeZipcode/{id}")
    private ResponseEntity<AuthorResponseDTO> removeZipcode(@PathVariable Long id) {

    }

}
