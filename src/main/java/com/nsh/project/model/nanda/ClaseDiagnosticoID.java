package com.nsh.project.model.nanda;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ClaseDiagnosticoID implements Serializable {

    private static final long serialVersionUID = -8192566686405747695L;

    @Column(name = "ID")
    private Long id;

    @Column(name = "DIA_ID")
    private Long diagnosticoId;

    //id de la tabla compuesta
}

