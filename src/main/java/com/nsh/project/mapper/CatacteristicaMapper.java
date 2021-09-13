package com.nsh.project.mapper;

import com.nsh.project.dto.CaracteristicaDTO;
import com.nsh.project.model.nanda.Caracteristica;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CatacteristicaMapper {

    // Entities to DTO
    CaracteristicaDTO toCaracteristicaDTO(Caracteristica agrupacion);

    List<CaracteristicaDTO> toCaracteristicaDTOList(List<Caracteristica> agrupacionList);

    //Dtos to entities

    Caracteristica toCaracteristica(CaracteristicaDTO tipoCaracteristicaDTO);

    List<Caracteristica> toCaracteristicaList(List<CaracteristicaDTO> tipoCaracteristicaDTOList);
}
