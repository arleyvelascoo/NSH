package com.nsh.project.service.interfaces;

import com.nsh.project.model.Diagnostico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDiagnosticoService {
    List<Diagnostico> getAll();
}