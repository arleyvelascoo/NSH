package com.nsh.project.mapper;

import com.nsh.project.dto.ClaseNandaDTO;
import com.nsh.project.model.nanda.ClaseNanda;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClaseNandaMapper {

    // Entities to DTO
    ClaseNandaDTO toClaseNandaDTO(ClaseNanda agrupacion);

    List<ClaseNandaDTO> toClaseNandaDTOList(List<ClaseNanda> agrupacionList);

    //Dtos to entities

    ClaseNanda toClaseNanda(ClaseNandaDTO tipoCaracteristicaDTO);

    List<ClaseNanda> toClaseNandaList(List<ClaseNandaDTO> tipoCaracteristicaDTOList);
}
