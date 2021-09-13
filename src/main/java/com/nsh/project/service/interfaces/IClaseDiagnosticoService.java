package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.ClaseDiagnostico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClaseDiagnosticoService {
    List<ClaseDiagnostico> getAll();

    ClaseDiagnostico createOne();

    ClaseDiagnostico updateOne();

    Boolean deleteOne();
}
