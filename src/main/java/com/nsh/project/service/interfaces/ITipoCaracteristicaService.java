package com.nsh.project.service.interfaces;

import com.nsh.project.model.TipoCaracteristica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITipoCaracteristicaService {
    List<TipoCaracteristica> getAll();
}
