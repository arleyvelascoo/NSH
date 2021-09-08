package com.nsh.project.controller;

import com.nsh.project.dto.DiagnosticoDTO;
import com.nsh.project.mapper.DiagnosticoMapper;
import com.nsh.project.service.interfaces.IDiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diagnostico")
public class DiagnosticoController {

    private IDiagnosticoService diagnosticoService;
    private DiagnosticoMapper diagnosticoMapper;
    //get one
    @GetMapping("/findById/{idDiagnostico}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idDiagnostico") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<DiagnosticoDTO>> findAll() {
        var list = this.diagnosticoService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.diagnosticoMapper.toDiagnosticoDTOList(list));
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearDiagnostico() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateDiagnostico(
            @PathVariable(name = "idDiagnostico") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idDiagnostico}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idDiagnostico") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("diagnosticoService")
    public void setDiagnosticoService(IDiagnosticoService diagnosticoService) {
        this.diagnosticoService = diagnosticoService;
    }
    @Autowired
    public void setDiagnosticoMapper(DiagnosticoMapper diagnosticoMapper) {
        this.diagnosticoMapper = diagnosticoMapper;
    }
}
