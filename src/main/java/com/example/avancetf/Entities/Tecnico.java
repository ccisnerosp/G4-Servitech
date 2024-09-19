package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "Tecnico")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String especialidad;
    private String descripcion;
    private String horario;
    private Boolean eliminado;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
