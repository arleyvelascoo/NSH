package com.nsh.project.service.interfaces;

import com.nsh.project.model.ClaseNanda;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClaseNandaService {
    List<ClaseNanda> getAll();
}
