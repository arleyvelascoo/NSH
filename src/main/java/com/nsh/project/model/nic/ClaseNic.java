package com.nsh.project.model.nic;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CLASE_NIC")
public class ClaseNic implements Serializable {
    private static final long serialVersionUID = 5382064607343720423L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ID_DOMINIO")
    private Long idDominio;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOMINIO", insertable = false, updatable = false)
    private DominioNic dominioNic;
}
