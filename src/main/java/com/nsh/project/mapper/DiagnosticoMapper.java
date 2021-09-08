package com.nsh.project.mapper;

import com.nsh.project.dto.DiagnosticoDTO;
import com.nsh.project.model.Diagnostico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DiagnosticoMapper {

    // Entities to DTO
    DiagnosticoDTO toDiagnosticoDTO(Diagnostico agrupacion);

    List<DiagnosticoDTO> toDiagnosticoDTOList(List<Diagnostico> agrupacionList);

    //Dtos to entities

    Diagnostico toDiagnostico(DiagnosticoDTO tipoCaracteristicaDTO);

    List<Diagnostico> toDiagnosticoList(List<DiagnosticoDTO> tipoCaracteristicaDTOList);
}
