package com.nsh.project.service.impl;

import com.nsh.project.model.nanda.DominioNanda;
import com.nsh.project.repository.IDominioNandaRepository;
import com.nsh.project.service.interfaces.IDominioNandaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("dominioNandaService")
@AllArgsConstructor
@Service
public class DominioNandaServiceImpl implements IDominioNandaService {

    private final IDominioNandaRepository dominioNandaRepository;

    @Override
    public List<DominioNanda> getAll(){
        return this.dominioNandaRepository.findAll();
    }

    @Override
    public DominioNanda createOne(){
        return null;
    }

    @Override
    public DominioNanda updateOne(){
        return null;
    }

    @Override
    public Boolean deleteOne(){
        return true;
    }


}
