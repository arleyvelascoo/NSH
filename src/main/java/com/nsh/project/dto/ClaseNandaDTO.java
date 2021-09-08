package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ClaseNandaDTO implements Serializable {
    private static final long serialVersionUID = 6023783076890470766L;
    private Long id;
    private Long idDominio;
    private String nombre;
    private String descripcion;
}
