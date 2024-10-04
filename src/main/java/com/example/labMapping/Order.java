package com.example.labMapping;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
