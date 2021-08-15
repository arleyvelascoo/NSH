package com.nsh.project.service.impl;

import com.nsh.project.model.Agrupacion;
import com.nsh.project.repositoy.IAgrupacionRepository;
import com.nsh.project.service.interfaces.IAgrupacionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("agrupacionService")
@AllArgsConstructor
@Service
public class AgrupacionServiceImpl implements IAgrupacionService {

    private final IAgrupacionRepository agrupacionRepository;

    @Override
    public List<Agrupacion> getAll(){
        return this.agrupacionRepository.findAll();
    }

}