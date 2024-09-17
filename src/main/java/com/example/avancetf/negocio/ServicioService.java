package com.example.avancetf.negocio;
import com.example.avancetf.Entities.Servicio;
import com.example.avancetf.repositories.ServicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface ServicioService {
    public Servicio insertarServicio(Servicio servicio);
    public void eliminarServicio(Long id);
    public Servicio modificarServicio(Servicio servicio);
    public List<Servicio> listarServicios();

}
