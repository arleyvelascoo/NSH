package com.nsh.project.service.impl;

import com.nsh.project.model.nanda.Agrupacion;
import com.nsh.project.repository.IAgrupacionRepository;
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


    @Override
    public Agrupacion createOne(){
        return null;
    }

    @Override
    public Agrupacion updateOne(){
        return null;
    }

    @Override
    public Boolean deleteOne(){
        return true;
    }



}
