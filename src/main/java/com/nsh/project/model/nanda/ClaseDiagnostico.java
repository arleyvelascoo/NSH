package com.nsh.project.model.nanda;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@Entity
@Table(name = "CLASE_DIAGNOSTICO")
public class ClaseDiagnostico implements Serializable {

    private static final long serialVersionUID = -9110473019498182237L;

    @EmbeddedId
    private ClaseDiagnosticoID claseDiagnosticoID;

    //por si toca mapear la tabla intermedia pues es con llave compuesta ytales
}
