package com.nsh.project.model.nanda;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CARACTERISTICA")
public class Caracteristica implements Serializable {
    private static final long serialVersionUID = -3158490423564799675L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "ID_DIAGNOSTICO")
    private Long idDiagnostico;

    @Column(name = "TIPO")
    private Long idTipoCaracteristica;

    @Column(name = "AGRUPACION")
    private Long idAgrupacion;


}
