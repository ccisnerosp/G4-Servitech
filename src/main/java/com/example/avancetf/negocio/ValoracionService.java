package com.example.avancetf.negocio;

import com.example.avancetf.Entities.Valoracion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ValoracionService {
    public Valoracion insertarValoracion(Valoracion valoracion);
    public void eliminarValoracion(Long id);
    public Valoracion modificarValoracion(Valoracion valoracion);
    public List<Valoracion> listarValoracions();
}
