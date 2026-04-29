package com.residencia.gestion_lavadero.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.TransactionUsageException;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "residente")
public class Residente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_residente")
    private Long id;

    private String nombre;

    private String apellido;

    @Column (nullable = false, unique = true)
    private String DNI;

    private String contrasenia;

    private String email;

    @Column (nullable = true)
    private String telefono;
}
