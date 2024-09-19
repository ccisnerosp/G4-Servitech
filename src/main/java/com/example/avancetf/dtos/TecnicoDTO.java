package com.example.avancetf.dtos;


import com.example.avancetf.Entities.Servicio;
import com.example.avancetf.Entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TecnicoDTO {

    private Long id;
    private String especialidad;
    private String descripcion;
    private String horario;
    private Boolean eliminado;
    private Usuario usuario;
}
