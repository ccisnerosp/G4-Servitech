package com.example.avancetf.serviceimpl;

import com.example.avancetf.Entities.Servicio;
import com.example.avancetf.Entities.Servicio;
import com.example.avancetf.negocio.ServicioService;
import com.example.avancetf.repositories.ServicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepositorio servicioRepositorio;

    @Override
    public Servicio insertarServicio(Servicio servicio) {
        return servicioRepositorio.save(servicio);
    }

    @Override
    public void eliminarServicio(Long id) {
        if(servicioRepositorio.existsById(id)) {
            servicioRepositorio.deleteById(id);
        }
    }

    @Override
    public Servicio modificarServicio(Servicio servicio) {
        if(servicioRepositorio.existsById(servicio.getId())){
            return servicioRepositorio.save(servicio);
        }
        return null;
    }

    @Override
    public List<Servicio> listarServicios() {
        return servicioRepositorio.findAll();
    }
}
