package com.example.avancetf.dtos;

import com.example.avancetf.Entities.Cliente;
import com.example.avancetf.Entities.Pago;
import com.example.avancetf.Entities.Tecnico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SolicitudServicioDTO {
    private Long id;
    private String fechaSolicitud;
    private String descripcionProblema;
    private Double precioFinal;
    private String estado;
    private Boolean eliminado;
    private Tecnico tecnico;
    private Cliente cliente;
    private Pago pago;
}
