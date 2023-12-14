package com.example.luyentap1412.ra.controller;

import com.example.luyentap1412.ra.service.book.BookRequestDTO;
import com.example.luyentap1412.ra.service.book.BookResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping("/add")
    public ResponseEntity<BookResponseDTO> addBook(@RequestBody BookRequestDTO bookRequestDto) {

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BookResponseDTO> getBook(@PathVariable Long id) {

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<BookResponseDTO>> getBooks() {

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BookResponseDTO> deleteBook(@PathVariable Long id) {

    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<BookResponseDTO> editBook(@RequestBody BookRequestDTO bookRequestDto,
                                                    @PathVariable Long id) {

    }

    @PostMapping("/addCategory/{categoryId}/to/{bookId}")
    public ResponseEntity<BookResponseDTO> addCategory(@PathVariable Long categoryId,
                                                       @PathVariable Long bookId) {

    }

    @PostMapping("/removeCategory/{categoryId}/from/{bookId}")
    public ResponseEntity<BookResponseDTO> removeCategory(@PathVariable Long categoryId,
                                                          @PathVariable Long bookId) {
    }

    @PostMapping("/addAuthor/{authorId}/to/{bookId}")
    public ResponseEntity<BookResponseDTO> addAuthor(@PathVariable Long authorId,
                                                     @PathVariable Long bookId) {
    }

    @PostMapping("/removeAuthor/{authorId}/from/{bookId}")
    public ResponseEntity<BookResponseDTO> removeAuthor(@PathVariable Long authorId,
                                                        @PathVariable Long bookId) {

    }


}
