package com.residencia.gestion_lavadero.mapper;

import com.residencia.gestion_lavadero.dto.ResidenteRequestDTO;
import com.residencia.gestion_lavadero.dto.ResidenteResponseDTO;
import com.residencia.gestion_lavadero.model.Residente;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ResidenteMapper {

    Residente toEntity(ResidenteRequestDTO dto);

    ResidenteResponseDTO toResponseDTO(Residente residente);

    List<ResidenteResponseDTO> toResponseDTOList(List<Residente> residentes);
}
