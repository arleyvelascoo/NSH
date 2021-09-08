package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TipoCaracteristicaDTO implements Serializable {
    private static final long serialVersionUID = 7126060367973970086L;
    private Long id;
    private String nombre;
}
