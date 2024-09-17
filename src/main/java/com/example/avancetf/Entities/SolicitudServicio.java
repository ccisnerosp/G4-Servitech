package com.example.avancetf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "SolicitudServicio")
@AllArgsConstructor

public class SolicitudServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String fechaSolicitud;
    private String fechaServicio;
    private Long descuento;
    private String estado;
    private Boolean eliminado;
    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;
}
