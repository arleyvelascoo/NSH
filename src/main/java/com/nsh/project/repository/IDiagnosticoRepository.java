package com.nsh.project.repository;

import com.nsh.project.model.nanda.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDiagnosticoRepository extends JpaRepository<Diagnostico, Long> {
}
