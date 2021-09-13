package com.nsh.project.model.nic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ACTIVIDAD_NIC")
public class ActividadNic implements Serializable {
    private static final long serialVersionUID = -4044748206003433935L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    private String nombre;

    @Column(name = "ID_INTERVENCION")
    private Long idIntervencion;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INTERVENCION", insertable = false, updatable = false)
    private Intervencion intervencion;
}
