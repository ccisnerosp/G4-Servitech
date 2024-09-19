package com.example.avancetf.serviceimpl;

import com.example.avancetf.Entities.Usuario;
import com.example.avancetf.service.UsuarioService;
import com.example.avancetf.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Transactional
    public Usuario insertarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        if(usuarioRepositorio.existsById(id)) {
            usuarioRepositorio.deleteById(id);
        }
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario) {
        if(usuarioRepositorio.existsById(usuario.getId())){
            return usuarioRepositorio.save(usuario);
        }
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findByEliminadoFalse();
    }

}
