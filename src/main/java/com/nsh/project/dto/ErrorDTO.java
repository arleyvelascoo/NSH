package com.nsh.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ErrorDTO implements Serializable {
    private static final long serialVersionUID = -7239615542005128277L;
    private String message;
}
