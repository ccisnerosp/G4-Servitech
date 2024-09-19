package com.example.avancetf.service;

import com.example.avancetf.Entities.Usuario;

import java.util.List;


public interface UsuarioService {
    public Usuario insertarUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public Usuario modificarUsuario(Usuario usuario);
    public List<Usuario> listarUsuarios();
}
