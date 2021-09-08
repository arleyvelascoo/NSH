package com.nsh.project.controller;

import com.nsh.project.service.interfaces.IAgrupacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agrupacion")
public class AgrupacionController {

    private IAgrupacionService agrupacionService;

    //get one
    @GetMapping("/findById/{idAgrupacion}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idAgrupacion") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.agrupacionService.getAll());
    }

    //create one
    @PostMapping("")
    public ResponseEntity<?> crearAgrupacion() {
        return ResponseEntity.ok(true);
    }

    //update one
    @PutMapping("")
    public ResponseEntity<?> updateAgrupacion(
            @PathVariable(name = "idAgrupacion") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //delete one
    @DeleteMapping("{idAgrupacion}")
    public ResponseEntity<?> deleteById(@PathVariable(name = "idAgrupacion") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    @Autowired
    @Qualifier("agrupacionService")
    public void setAgrupacionService(IAgrupacionService agrupacionService) {
        this.agrupacionService = agrupacionService;
    }
}
