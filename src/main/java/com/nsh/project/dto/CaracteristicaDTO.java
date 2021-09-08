package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CaracteristicaDTO implements Serializable {
    private static final long serialVersionUID = -3121475721032511559L;
    private Long id;

    private String nombre;

    private Long idDiagnostico;

    private Long idTipoCaracteristica;

    private Long idAgrupacion;
}
