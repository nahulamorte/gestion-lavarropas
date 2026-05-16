package com.residencia.gestion_lavadero.service;

import com.residencia.gestion_lavadero.dto.ResidenteRequestDTO;
import com.residencia.gestion_lavadero.dto.ResidenteResponseDTO;
import com.residencia.gestion_lavadero.mapper.ResidenteMapper;
import com.residencia.gestion_lavadero.model.Residente;
import com.residencia.gestion_lavadero.repository.ResidenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.residencia.gestion_lavadero.exception.ResidenteNoExistenteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResidenteService {

    private final ResidenteRepository residenteRepository;
    private final ResidenteMapper residenteMapper;

    public List<ResidenteResponseDTO> listarTodos(){
        return residenteMapper.toResponseDTOList(residenteRepository.findAll());
    }

    public ResidenteResponseDTO listarPorId(Long id){
        Residente residente = residenteRepository.findById(id)
                .orElseThrow(() -> new ResidenteNoExistenteException("Residente no encontrado con ID: " + id));

        return residenteMapper.toResponseDTO(residente);
    }

    public ResidenteResponseDTO registrarResidente(ResidenteRequestDTO  residenteDTO){
        if (residenteRepository.existsByDni(residenteDTO.dni())){
            throw new IllegalArgumentException("Ya existe un residente con el mismo DNI.");
        }

        //Mapeo del RequestDTO a una entidad
        Residente residente = residenteMapper.toEntity(residenteDTO);

        //TO DO: ENCRIPTAR la contraseña antes de guardar. Falta configurar Spring Security

        residenteRepository.save(residente); //Guardamos en la base de datos.

        //Mapeo la entidad a un ResponseDTO
        ResidenteResponseDTO responseDTO = residenteMapper.toResponseDTO(residente);

        return responseDTO;
    }

    public ResidenteResponseDTO eliminarResidente(Long id){
        Residente residente = residenteRepository.findById(id).orElseThrow(() -> new ResidenteNoExistenteException("No se encontró el residente con ID: " + id));

        ResidenteResponseDTO response = residenteMapper.toResponseDTO(residente);

        residenteRepository.delete(residente);

        return response;
    }



}
