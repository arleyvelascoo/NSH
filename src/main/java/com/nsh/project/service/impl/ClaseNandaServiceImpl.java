package com.nsh.project.service.impl;

import com.nsh.project.model.ClaseNanda;
import com.nsh.project.repository.IClaseNandaRepository;
import com.nsh.project.service.interfaces.IClaseNandaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("claseNandaService")
@AllArgsConstructor
@Service
public class ClaseNandaServiceImpl implements IClaseNandaService{

    private final IClaseNandaRepository claseNandaRepository;

    @Override
    public List<ClaseNanda> getAll(){
        return this.claseNandaRepository.findAll();
    }

    @Override
    public ClaseNanda createOne(){
        return null;
    }

    @Override
    public ClaseNanda updateOne(){
        return null;
    }

    @Override
    public Boolean deleteOne(){
        return true;
    }


}
