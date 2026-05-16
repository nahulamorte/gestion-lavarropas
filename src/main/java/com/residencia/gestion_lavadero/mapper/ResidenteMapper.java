package com.residencia.gestion_lavadero.mapper;

import com.residencia.gestion_lavadero.dto.ResidenteRequestDTO;
import com.residencia.gestion_lavadero.dto.ResidenteResponseDTO;
import com.residencia.gestion_lavadero.model.Residente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ResidenteMapper {

    @Mapping(target = "id", ignore = true)
    Residente toEntity(ResidenteRequestDTO dto);

    ResidenteResponseDTO toResponseDTO(Residente residente);

    List<ResidenteResponseDTO> toResponseDTOList(List<Residente> residentes);
}
