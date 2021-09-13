package com.nsh.project.service.impl;

import com.nsh.project.model.nanda.Diagnostico;
import com.nsh.project.repository.IDiagnosticoRepository;
import com.nsh.project.service.interfaces.IDiagnosticoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("diagnosticoService")
@AllArgsConstructor
@Service
public class DiagnosticoServiceImpl implements IDiagnosticoService{

    private final IDiagnosticoRepository diagnosticoRepository;

    @Override
    public List<Diagnostico> getAll(){
        return this.diagnosticoRepository.findAll();
    }

    @Override
    public Diagnostico createOne(){
        return null;
    }

    @Override
    public Diagnostico updateOne(){
        return null;
    }

    @Override
    public Boolean deleteOne(){
        return true;
    }


}
