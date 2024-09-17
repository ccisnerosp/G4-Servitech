package com.example.avancetf.serviceimpl;

import com.example.avancetf.Entities.Valoracion;
import com.example.avancetf.negocio.ValoracionService;
import com.example.avancetf.repositories.ValoracionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ValoracionServiceImpl implements ValoracionService {
    @Autowired
    private ValoracionRepositorio valoracionRepositorio;
    @Override
    public Valoracion insertarValoracion(Valoracion valoracion) {
        return valoracionRepositorio.save(valoracion);
    }

    @Override
    public void eliminarValoracion(Long id) {
        if(valoracionRepositorio.existsById(id)) {
            valoracionRepositorio.deleteById(id);
        }
    }

    @Override
    public Valoracion modificarValoracion(Valoracion valoracion) {
        if(valoracionRepositorio.existsById(valoracion.getId())){
            return valoracionRepositorio.save(valoracion);
        }
        return null;
    }

    @Override
    public List<Valoracion> listarValoracions() {
        return valoracionRepositorio.findAll();
    }

}
