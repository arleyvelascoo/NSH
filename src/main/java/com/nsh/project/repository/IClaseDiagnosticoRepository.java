package com.nsh.project.repository;

import com.nsh.project.model.ClaseDiagnostico;
import com.nsh.project.model.ClaseDiagnosticoID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClaseDiagnosticoRepository extends JpaRepository<ClaseDiagnostico, ClaseDiagnosticoID> {
}
