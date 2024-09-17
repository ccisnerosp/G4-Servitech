package com.example.avancetf.dtos;

import com.example.avancetf.Entities.Cliente;
import com.example.avancetf.Entities.Servicio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValoracionDTO {
    private Long id;
    private String comentario;
    private Float calificacion;
    private Cliente cliente;
    private Servicio servicio;
}
