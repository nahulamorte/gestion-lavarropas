package com.residencia.gestion_lavadero.dto;


import com.residencia.gestion_lavadero.model.Modulo;
import jakarta.validation.constraints.NotBlank;

public record  ResidenteRequestDTO (
     @NotBlank Long id,
     @NotBlank String nombre,
     @NotBlank String apellido,
     @NotBlank String DNI,
     @NotBlank Modulo modulo,
     @NotBlank String contrasenia,
     @NotBlank String email,
     String telefono
){
    public ResidenteRequestDTO {
        if (DNI == null || DNI.isBlank()){
            throw new IllegalArgumentException("El DNI es obligatorio");
        }
        if (contrasenia != null || contrasenia.length() != 8) {
            throw new IllegalArgumentException("La contraseña tiene que tener 8 digitos");
        }
    }
}
