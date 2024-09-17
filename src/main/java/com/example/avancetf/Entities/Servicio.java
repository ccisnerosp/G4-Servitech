package com.example.avancetf.Entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Servicio")
@AllArgsConstructor
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String descripcion;
    private String tipo;
    private float costo;
    private String estado;
    private Boolean eliminado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tecnico_id")
    @JsonBackReference
    private Tecnico tecnico;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    @JsonManagedReference("servicio_valoracion")
    private List<Valoracion> valoraciones = new ArrayList<>();
}
