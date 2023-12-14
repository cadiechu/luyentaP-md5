package com.example.luyentap1412.ra.service.author;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService{

    @Override
    public AuthorResponseDTO addAuthor(AuthorRequestDTO authorRequestDto) {
        return null;
    }

    @Override
    public AuthorResponseDTO getAuthorById(Long id) {
        return null;
    }

    @Override
    public List<AuthorResponseDTO> getAllAuthors() {
        return null;
    }

    @Override
    public AuthorResponseDTO editAuthor(Long id, AuthorRequestDTO authorRequestDto) {
        return null;
    }

    @Override
    public AuthorResponseDTO deleteAuthorById(Long id) {
        return null;
    }

    @Override
    public AuthorResponseDTO addZipcodeToAuthor(Long zipcodeId, Long authorId) {
        return null;
    }

    @Override
    public AuthorResponseDTO removeZipcodeFromAuthor(Long id) {
        return null;
    }
}
