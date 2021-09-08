package com.nsh.project.controller;

import com.nsh.project.service.interfaces.ITipoCaracteristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipoCaracteristica")
public class TipoCaracteristicaController {

    private ITipoCaracteristicaService tipoCaracteristicaService;


    //get one
    @GetMapping("/findById/{idTipoCaracteristica}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idTipoCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.tipoCaracteristicaService.getAll());
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearTipoCaracteristica() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateTipoCaracteristica(
            @PathVariable(name = "idTipoCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idTipoCaracteristica}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idTipoCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("tipoCaracteristicaService")
    public void setTipoCaracteristicaService(ITipoCaracteristicaService tipoCaracteristicaService) {
        this.tipoCaracteristicaService = tipoCaracteristicaService;
    }
}
