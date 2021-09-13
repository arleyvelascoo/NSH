package com.nsh.project.model.nanda;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TIPO_CARACTERISTICA")
public class TipoCaracteristica implements Serializable {

    private static final long serialVersionUID = 8080439396220368106L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

}
