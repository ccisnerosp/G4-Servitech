package com.example.avancetf.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "Tecnico")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String especialidad;
    private String descripcion;
    private String horario;
    private Boolean eliminado;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;
    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    @JsonManagedReference("tecnico_servicios")
    private List<Servicio> servicios = new ArrayList<>();

}
