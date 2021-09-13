package com.nsh.project.mapper;

import com.nsh.project.dto.TipoCaracteristicaDTO;
import com.nsh.project.model.nanda.TipoCaracteristica;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoCaracteristicaMapper {


    // Entities to DTO
    TipoCaracteristicaDTO toTipoCaracteristicaDTO(TipoCaracteristica agrupacion);

    List<TipoCaracteristicaDTO> toTipoCaracteristicaDTOList(List<TipoCaracteristica> agrupacionList);
    
    
    //Dtos to entities
    
    TipoCaracteristica toTipoCaracteristica(TipoCaracteristicaDTO tipoCaracteristicaDTO);

    List<TipoCaracteristica> toTipoCaracteristicaList(List<TipoCaracteristicaDTO> tipoCaracteristicaDTOList);
    
    
}
