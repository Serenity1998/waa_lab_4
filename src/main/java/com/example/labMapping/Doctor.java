package com.example.labMapping;

import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String doctortype;
    private String firstname;
    private String lastname;

}
