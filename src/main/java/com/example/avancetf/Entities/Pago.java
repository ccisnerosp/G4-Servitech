package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Pago")
@Data
@RequiredArgsConstructor
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fecha;
    private String metodoPago;
}
