package com.example.luyentap1412.ra.service.author;

import com.example.luyentap1412.ra.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAuthorService {
    List<Author> findAll();

    Author findById(Long id);

    Author save(Author author);

    void delete(Long id);

}
