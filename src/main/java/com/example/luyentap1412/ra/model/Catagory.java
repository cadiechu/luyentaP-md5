package com.example.luyentap1412.ra.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@Table (name="category")

public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100)
    private String name;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book_id;
}