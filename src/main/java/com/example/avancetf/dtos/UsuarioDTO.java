package com.example.avancetf.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
    private String usuario;
    private String direccion;
    private Boolean eliminado;
}
