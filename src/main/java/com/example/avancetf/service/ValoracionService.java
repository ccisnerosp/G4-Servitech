package com.example.avancetf.service;

import com.example.avancetf.Entities.Valoracion;

import java.util.List;

public interface ValoracionService {
    public Valoracion insertarValoracion(Valoracion valoracion);
    public void eliminarValoracion(Long id);
    public Valoracion modificarValoracion(Valoracion valoracion);
    public List<Valoracion> listarValoracions();
    public List<Valoracion> findByTecnicoId(Long id);
}
