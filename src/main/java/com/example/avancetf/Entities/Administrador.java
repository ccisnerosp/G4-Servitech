package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrador")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nivelAcceso;
    @OneToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario;

}