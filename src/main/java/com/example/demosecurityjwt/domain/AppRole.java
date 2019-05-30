package com.example.demosecurityjwt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class AppRole {

    @Id @GeneratedValue
    private Long id;

    private String role;

}
