package com.residencia.gestion_lavadero.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        String codigo,
        String mensaje,
        LocalDateTime timestamp
) {}
