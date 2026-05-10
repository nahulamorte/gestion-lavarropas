package com.residencia.gestion_lavadero.dto;


public record  ResidenteRequestDTO (
     Long id,
     String nombre,
     String apellido,
     String DNI,
     String contrasenia,
     String email,
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
