package com.nsh.project.controller;

import com.nsh.project.service.interfaces.IDiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/diagnostico")
public class DiagnosticoController {

    private IDiagnosticoService diagnosticoService;

    //get one
    @GetMapping("/findById/{idDiagnostico}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idDiagnostico") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.diagnosticoService.getAll());
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
}
