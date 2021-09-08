package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DiagnosticoDTO implements Serializable {
    private static final long serialVersionUID = -7329040547672325058L;
    private Long id;
    private String nombre;
    private String descripcion;
}
