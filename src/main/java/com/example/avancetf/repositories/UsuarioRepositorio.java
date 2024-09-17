package com.example.avancetf.repositories;

import com.example.avancetf.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
