package com.residencia.gestion_lavadero.service;

import com.residencia.gestion_lavadero.repository.LavadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LavadoService {

    private final LavadoRepository lavadoRepository;


}
