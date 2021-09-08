package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DominioNandaDTO implements Serializable {

    private static final long serialVersionUID = 5137483760785804483L;
    private Long id;
    private String nombre;
    private String descripcion;
}
