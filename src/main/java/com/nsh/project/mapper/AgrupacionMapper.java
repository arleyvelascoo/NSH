package com.nsh.project.mapper;

import com.nsh.project.dto.AgrupacionDTO;
import com.nsh.project.model.Agrupacion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgrupacionMapper {

    // Entities to DTO
    AgrupacionDTO toAgrupacionDTO(Agrupacion agrupacion);

    List<AgrupacionDTO> toAgrupacionDTOList(List<Agrupacion> agrupacionList);

    //Dtos to entities

    Agrupacion toAgrupacion(AgrupacionDTO tipoCaracteristicaDTO);

    List<Agrupacion> toAgrupacionList(List<AgrupacionDTO> tipoCaracteristicaDTOList);

}
