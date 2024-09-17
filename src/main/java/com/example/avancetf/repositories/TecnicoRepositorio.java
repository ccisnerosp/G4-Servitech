package com.example.avancetf.repositories;

import com.example.avancetf.Entities.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TecnicoRepositorio extends JpaRepository<Tecnico, Long> {
    //@Query("SELECT COUNT(t) FROM Servicio s, Tecnico t WHERE s.eliminado=false and s.tecnico.id =: id_T")
    //int countTecnico(Long id_T);
}
