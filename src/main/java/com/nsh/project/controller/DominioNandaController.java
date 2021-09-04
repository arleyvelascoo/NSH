package com.nsh.project.controller;

import com.nsh.project.service.interfaces.IDominioNandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dominioDominioNanda")
public class DominioNandaController {

    private IDominioNandaService dominioNandaService;

    //get one
    @GetMapping("/findById/{idDominioDominioNanda}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idDominioDominioNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.dominioNandaService.getAll());
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearDominioNanda() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateDominioNanda(
            @PathVariable(name = "idDominioDominioNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idDominioDominioNanda}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idDominioDominioNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("dominioNandaService")
    public void setDominioNandaService(IDominioNandaService dominioNandaService) {
        this.dominioNandaService = dominioNandaService;
    }
}
