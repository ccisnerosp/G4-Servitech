package com.example.avancetf.negocio;

import com.example.avancetf.Entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    public Usuario insertarUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public Usuario modificarUsuario(Usuario usuario);
    public List<Usuario> listarUsuarios();
}
