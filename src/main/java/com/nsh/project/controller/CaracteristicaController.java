package com.nsh.project.controller;

import com.nsh.project.service.interfaces.ICaracteristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/caracteristica")
public class CaracteristicaController {

    private ICaracteristicaService caracteristicaService;

    //get one
    @GetMapping("/findById/{idCaracteristica}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.caracteristicaService.getAll());
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearCaracteristica() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateCaracteristica(
            @PathVariable(name = "idCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idCaracteristica}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("caracteristicaService")
    public void setCaracteristicaService(ICaracteristicaService caracteristicaService) {
        this.caracteristicaService = caracteristicaService;
    }
}
