package com.example.avancetf.serviceimpl;

import com.example.avancetf.Entities.Tecnico;
import com.example.avancetf.negocio.TecnicoService;
import com.example.avancetf.repositories.TecnicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoServiceImpl implements TecnicoService {
    @Autowired
    private TecnicoRepositorio tecnicoRepositorio;

    @Override
    public Tecnico insertarTecnico(Tecnico tecnico) {
        return tecnicoRepositorio.save(tecnico);
    }

    @Override
    public void eliminarTecnico(Long id) {
        if(tecnicoRepositorio.existsById(id)) {
            tecnicoRepositorio.deleteById(id);
        }
    }

    @Override
    public Tecnico modificarTecnico(Tecnico tecnico) {
        if(tecnicoRepositorio.existsById(tecnico.getId())){
            return tecnicoRepositorio.save(tecnico);
        }
        return null;
    }

    @Override
    public List<Tecnico> listarTecnicos() {
        return tecnicoRepositorio.findAll();
    }

}