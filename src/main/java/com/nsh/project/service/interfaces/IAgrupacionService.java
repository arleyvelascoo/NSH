package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.Agrupacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAgrupacionService {
    List<Agrupacion> getAll();

    Agrupacion createOne();

    Agrupacion updateOne();

    Boolean deleteOne();
}
