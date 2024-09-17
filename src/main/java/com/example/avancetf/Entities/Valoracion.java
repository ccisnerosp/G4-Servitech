package com.example.avancetf.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@Table(name = "Valoracion")
@NoArgsConstructor
@AllArgsConstructor
public class Valoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String comentario;
    private Float calificacion;
    private String fecha;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

}