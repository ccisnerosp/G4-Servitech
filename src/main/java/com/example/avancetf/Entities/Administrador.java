package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrador")
@Data
@RequiredArgsConstructor
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nivelAcceso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

}