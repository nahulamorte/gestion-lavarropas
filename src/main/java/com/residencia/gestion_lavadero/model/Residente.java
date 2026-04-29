package com.residencia.gestion_lavadero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.TransactionUsageException;

@Entity
@Getter @Setter
@Table (name = "residente")
public class Residente {
    @Id
    private Long id;

    private String nombre;

    private String apellido;

    private String DNI;

    private String contrasenia;

    private String email;

    @Column (nullable = true)
    private String telefono;
}
