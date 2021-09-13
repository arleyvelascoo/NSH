package com.nsh.project.service.interfaces;

import com.nsh.project.model.nanda.Diagnostico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDiagnosticoService {
    List<Diagnostico> getAll();

    Diagnostico createOne();

    Diagnostico updateOne();

    Boolean deleteOne();
}
