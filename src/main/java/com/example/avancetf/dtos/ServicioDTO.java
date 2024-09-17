package com.example.avancetf.dtos;

import com.example.avancetf.Entities.Tecnico;
import com.example.avancetf.Entities.Valoracion;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicioDTO{

    private Long id;
    private String descripcion;
    private String tipo;
    private float costo;
    private String estado;
    private Boolean eliminado;
    private Tecnico tecnico;
    private List<Valoracion> valoraciones = new ArrayList<>();
}
