package com.nsh.project.service.interfaces;

import com.nsh.project.model.DominioNanda;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDominioNandaService {
    List<DominioNanda> getAll();
}
