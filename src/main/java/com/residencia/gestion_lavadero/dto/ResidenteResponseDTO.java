package com.residencia.gestion_lavadero.dto;

public record ResidenteResponseDTO(
        String nombre,
        String apellido,
        String DNI,
        String email,
        String telefono
) {
}
