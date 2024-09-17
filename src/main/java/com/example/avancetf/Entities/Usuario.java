package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
@Data
@RequiredArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
    private String usuario;
    private String direccion;
    private Boolean eliminado;
}