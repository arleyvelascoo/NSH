package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.ClaseNanda;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClaseNandaService {
    List<ClaseNanda> getAll();

    ClaseNanda createOne();

    ClaseNanda updateOne();

    Boolean deleteOne();
}
