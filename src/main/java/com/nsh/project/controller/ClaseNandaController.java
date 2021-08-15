package com.nsh.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nanda")
public class ClaseNandaController {
//get one
    @GetMapping("/findById/{idNanda}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(true);
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
}
