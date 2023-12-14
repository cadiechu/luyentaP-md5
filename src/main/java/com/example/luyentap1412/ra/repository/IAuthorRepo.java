package com.example.luyentap1412.ra.repository;

import com.example.luyentap1412.ra.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepo extends JpaRepository<Author, Long> {
}
