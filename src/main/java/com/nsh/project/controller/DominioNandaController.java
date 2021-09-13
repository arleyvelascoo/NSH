package com.nsh.project.controller;

import com.nsh.project.dto.DominioNandaDTO;
import com.nsh.project.mapper.DominioNandaMapper;
import com.nsh.project.service.interfaces.IDominioNandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dominioDominioNanda")
public class DominioNandaController {

    private IDominioNandaService dominioNandaService;
    private DominioNandaMapper dominioNandaMapper;

    //get one
    @GetMapping("/findById/{idDominioDominioNanda}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idDominioDominioNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<DominioNandaDTO>> findAll() {
        var list = this.dominioNandaService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.dominioNandaMapper.toDominioNandaDTOList(list));
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
    @Autowired
    public void setDominioNandaMapper(DominioNandaMapper dominioNandaMapper) {
        this.dominioNandaMapper = dominioNandaMapper;
    }
}
