package com.nsh.project.mapper;

import com.nsh.project.dto.DominioNandaDTO;
import com.nsh.project.model.DominioNanda;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DominioNandaMapper {

    // Entities to DTO
    DominioNandaDTO toDominioNandaDTO(DominioNanda agrupacion);

    List<DominioNandaDTO> toDominioNandaDTOList(List<DominioNanda> agrupacionList);


    //Dtos to entities

    DominioNanda toDominioNanda(DominioNandaDTO tipoCaracteristicaDTO);

    List<DominioNanda> toDominioNandaList(List<DominioNandaDTO> tipoCaracteristicaDTOList);

}
