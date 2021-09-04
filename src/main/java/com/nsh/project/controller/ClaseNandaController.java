package com.nsh.project.controller;

import com.nsh.project.service.interfaces.IClaseNandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claseNanda")
public class ClaseNandaController {

    private IClaseNandaService claseNandaService;

    //get one
    @GetMapping("/findById/{idNanda}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.claseNandaService.getAll());
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearNanda() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateNanda(
            @PathVariable(name = "idNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idNanda}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("claseNandaService")
    public void setClaseNandaService(IClaseNandaService claseNandaService) {
        this.claseNandaService = claseNandaService;
    }
}
