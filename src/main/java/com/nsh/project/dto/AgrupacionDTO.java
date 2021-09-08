package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AgrupacionDTO implements Serializable {
    private static final long serialVersionUID = 5531275642393837521L;
    private Long id;
    private String nombre;
}
