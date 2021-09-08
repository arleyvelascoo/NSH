package com.nsh.project.service.impl;

import com.nsh.project.model.Caracteristica;
import com.nsh.project.repository.ICaracteristicaRepository;
import com.nsh.project.service.interfaces.ICaracteristicaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("caracteristicaService")
@AllArgsConstructor
@Service
public class CaracteristicaServiceImpl implements ICaracteristicaService {

    private final ICaracteristicaRepository caracteristicaRepository;

    @Override
    public List<Caracteristica> getAll(){
        return this.caracteristicaRepository.findAll();
    }


    @Override
    public Caracteristica createOne(){
        return null;
    }

    @Override
    public Caracteristica updateOne(){
        return null;
    }

    @Override
    public Boolean deleteOne(){
        return true;
    }


}
