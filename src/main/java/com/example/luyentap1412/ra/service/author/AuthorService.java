package com.example.luyentap1412.ra.service.author;

import com.example.luyentap1412.ra.model.Author;
import com.example.luyentap1412.ra.repository.IAuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {
    private final IAuthorRepo authorRepo;

    @Override
    public List<Author> findAll() {
        return authorRepo.findAll();
    }

    @Override
    public Author findById(Long id) {
        return authorRepo.findById(id).orElse(null);
    }

    @Override
    public Author save(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public void delete(Long id) {
        authorRepo.deleteById(id);
    }

}