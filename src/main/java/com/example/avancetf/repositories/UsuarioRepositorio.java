package com.example.avancetf.repositories;

import com.example.avancetf.Entities.Cliente;
import com.example.avancetf.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    List<Usuario> findByEliminadoFalse();
}
