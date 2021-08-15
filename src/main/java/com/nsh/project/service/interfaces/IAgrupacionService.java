package com.nsh.project.service.interfaces;

import com.nsh.project.model.Agrupacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAgrupacionService {
    List<Agrupacion> getAll();
}
