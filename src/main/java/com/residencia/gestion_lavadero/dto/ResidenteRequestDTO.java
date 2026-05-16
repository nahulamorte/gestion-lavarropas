package com.residencia.gestion_lavadero.dto;

import com.residencia.gestion_lavadero.model.Modulo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ResidenteRequestDTO(
        @NotBlank(message = "El nombre es obligatorio") String nombre,
        @NotBlank(message = "El apellido es obligatorio") String apellido,
        @NotBlank(message = "El DNI es obligatorio") String dni,
        @NotNull(message = "El módulo es obligatorio") Modulo modulo,
        @NotBlank(message = "La contraseña es obligatoria")
        @Size(min = 8, max = 8, message = "La contraseña debe tener exactamente 8 caracteres") String contrasenia,
        @NotBlank(message = "El email es obligatorio") @Email(message = "Email inválido") String email,
        String telefono
) {}