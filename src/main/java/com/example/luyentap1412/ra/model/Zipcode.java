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
@Table(name = "zipcode")
public class Zipcode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length =100)
    private String name;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;
    @OneToMany(mappedBy = "zipcode")
    private List<Author> authorList;
}
