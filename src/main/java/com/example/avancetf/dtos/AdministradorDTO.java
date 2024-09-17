package com.example.avancetf.dtos;

import com.example.avancetf.Entities.Usuario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorDTO {
    private Long id;
    private String nivelAcceso;
    private Usuario usuario;
}
