package com.example.luyentap1412.ra.service.author;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorRequestDTO {
    private String name;
    private String zipcode;
    private String auBook;
}
