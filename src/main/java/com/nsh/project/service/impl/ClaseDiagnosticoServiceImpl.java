package com.nsh.project.service.impl;

import com.nsh.project.model.ClaseDiagnostico;
import com.nsh.project.repositoy.IClaseDiagnosticoRepository;
import com.nsh.project.service.interfaces.IClaseDiagnosticoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("claseDiagnosticoService")
@AllArgsConstructor
@Service
public class ClaseDiagnosticoServiceImpl implements IClaseDiagnosticoService {

    private final IClaseDiagnosticoRepository claseDiagnosticoRepository;

    @Override
    public List<ClaseDiagnostico> getAll(){
        return this.claseDiagnosticoRepository.findAll();
    }
}
