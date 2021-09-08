package com.nsh.project.controller;

import com.nsh.project.dto.AgrupacionDTO;
import com.nsh.project.mapper.AgrupacionMapper;
import com.nsh.project.service.interfaces.IAgrupacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/agrupacion")
public class AgrupacionController {

    private IAgrupacionService agrupacionService;
    private AgrupacionMapper agrupacionMapper;

    //get one
    @GetMapping("/findById/{idAgrupacion}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idAgrupacion") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<AgrupacionDTO>> findAll() {
        var list = this.agrupacionService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.agrupacionMapper.toAgrupacionDTOList(list));
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

    @Autowired
    public void setAgrupacionMapper(AgrupacionMapper agrupacionMapper) {
        this.agrupacionMapper = agrupacionMapper;
    }
}
