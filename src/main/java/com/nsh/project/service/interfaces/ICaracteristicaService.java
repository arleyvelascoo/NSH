package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.Caracteristica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICaracteristicaService {
    List<Caracteristica> getAll();

    Caracteristica createOne();

    Caracteristica updateOne();

    Boolean deleteOne();
}
