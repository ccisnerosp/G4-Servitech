package com.example.avancetf.repositories;

import com.example.avancetf.Entities.SolicitudServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolicitudRepositorio extends JpaRepository<SolicitudServicio, Long> {
    List<SolicitudServicio> findByEstadoAndServicioTecnicoId(String estado, Long servicioTecnicoId);
    List<SolicitudServicio> findByClienteId(Long id);
}
