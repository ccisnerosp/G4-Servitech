package com.example.avancetf.dtos;

import com.example.avancetf.Entities.SolicitudServicio;
import com.example.avancetf.Entities.Usuario;
import com.example.avancetf.Entities.Valoracion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClienteDTO {

    private Long id;
    private String historialServicios;
    private Usuario usuario;


}