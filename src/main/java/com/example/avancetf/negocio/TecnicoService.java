package com.example.avancetf.negocio;

import com.example.avancetf.Entities.Servicio;
import com.example.avancetf.Entities.Tecnico;
import com.example.avancetf.repositories.ServicioRepositorio;
import com.example.avancetf.repositories.TecnicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public interface TecnicoService {
    public Tecnico insertarTecnico(Tecnico tecnico);
    public void eliminarTecnico(Long id);
    public Tecnico modificarTecnico(Tecnico tecnico);
    public List<Tecnico> listarTecnicos();
}
