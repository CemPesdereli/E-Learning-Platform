package com.cem.elearningplatform.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue()
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;





}



















