package com.residencia.gestion_lavadero.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table (name = "lavado")
public class Lavado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lavado")
    private Long id;

    @Column (name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column (name = "fecha_fin")
    private LocalDateTime fechaFin;

    private EstadoLavado estado;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "id_residente", nullable = false)
    private Residente residente;
}
