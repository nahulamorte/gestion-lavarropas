package com.residencia.gestion_lavadero.dto;

import com.residencia.gestion_lavadero.model.Modulo;

public record ResidenteResponseDTO(
        String nombre,
        String apellido,
        String DNI,
        String email,
        String telefono,
        Modulo modulo
) {
}
