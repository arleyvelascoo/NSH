package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.TipoCaracteristica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITipoCaracteristicaService {
    List<TipoCaracteristica> getAll();

    TipoCaracteristica createOne();

    TipoCaracteristica updateOne();

    Boolean deleteOne();
}
