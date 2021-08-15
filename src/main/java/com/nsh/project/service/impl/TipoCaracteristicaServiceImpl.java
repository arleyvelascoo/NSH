package com.nsh.project.service.impl;

import com.nsh.project.model.TipoCaracteristica;
import com.nsh.project.repositoy.ITipoCaracteristicaRepository;
import com.nsh.project.service.interfaces.ITipoCaracteristicaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Qualifier("tipoCaracteristicaService")
@AllArgsConstructor
@Service
public class TipoCaracteristicaServiceImpl implements ITipoCaracteristicaService {

    private final ITipoCaracteristicaRepository tipoCaracteristicaRepository;

    @Override
    public List<TipoCaracteristica> getAll(){
        return this.tipoCaracteristicaRepository.findAll();
    }
}
