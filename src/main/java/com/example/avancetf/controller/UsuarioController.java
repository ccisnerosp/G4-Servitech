package com.example.avancetf.controller;

import com.example.avancetf.Entities.Usuario;
import com.example.avancetf.dtos.UsuarioDTO;
import com.example.avancetf.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200","http://18.216.202.149/"})
@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public UsuarioDTO insertarUsuario(@RequestBody UsuarioDTO UsuarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(UsuarioDTO, Usuario.class);
        usuario = usuarioService.insertarUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    @GetMapping("/usuarios")
    public List<UsuarioDTO> listarUsuarios() {
        List<Usuario> lista = usuarioService.listarUsuarios();
        ModelMapper modelMapper = new ModelMapper();
        List<UsuarioDTO> listaDTO = modelMapper.map(lista, List.class);
        return listaDTO;
    }

    @PutMapping("/usuario")
    public UsuarioDTO modificarUsuario(@RequestBody UsuarioDTO UsuarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(UsuarioDTO, Usuario.class);
        usuario = usuarioService.modificarUsuario(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    @DeleteMapping("/usuario")
    public void eliminarUsuario(@RequestBody UsuarioDTO UsuarioDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario usuario = modelMapper.map(UsuarioDTO, Usuario.class);
        usuarioService.eliminarUsuario(usuario.getId());
    }

}
