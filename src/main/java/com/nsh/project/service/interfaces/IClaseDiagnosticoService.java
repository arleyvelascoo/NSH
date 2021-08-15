package com.nsh.project.service.interfaces;

import com.nsh.project.model.ClaseDiagnostico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClaseDiagnosticoService {
    List<ClaseDiagnostico> getAll();
}
