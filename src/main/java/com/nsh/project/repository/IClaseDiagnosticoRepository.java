package com.nsh.project.repository;

import com.nsh.project.model.nanda.ClaseDiagnostico;
import com.nsh.project.model.nanda.ClaseDiagnosticoID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClaseDiagnosticoRepository extends JpaRepository<ClaseDiagnostico, ClaseDiagnosticoID> {
}
