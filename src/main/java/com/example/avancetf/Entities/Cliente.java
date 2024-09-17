package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cliente")
@Data
@RequiredArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String historialServicios;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonManagedReference("cliente_valoracion")
    private List<Valoracion> valoraciones = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonManagedReference("cliente_solicitud")
    private List<SolicitudServicio> solicitudes = new ArrayList<>();


}