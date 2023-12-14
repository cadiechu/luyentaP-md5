package com.example.luyentap1412.ra.service.author;

import com.example.luyentap1412.ra.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAuthorService {
    AuthorResponseDTO addAuthor(AuthorRequestDTO authorRequestDto);
    AuthorResponseDTO getAuthorById(Long id);
    List<AuthorResponseDTO> getAllAuthors();
    AuthorResponseDTO editAuthor(Long id, AuthorRequestDTO authorRequestDto);
    AuthorResponseDTO deleteAuthorById(Long id);
    AuthorResponseDTO addZipcodeToAuthor(Long zipcodeId, Long authorId);
    AuthorResponseDTO removeZipcodeFromAuthor(Long id);
}
