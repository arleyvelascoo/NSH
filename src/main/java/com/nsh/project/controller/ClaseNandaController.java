package com.nsh.project.controller;

import com.nsh.project.dto.ClaseNandaDTO;
import com.nsh.project.mapper.ClaseNandaMapper;
import com.nsh.project.service.interfaces.IClaseNandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claseNanda")
public class ClaseNandaController {

    private IClaseNandaService claseNandaService;
    private ClaseNandaMapper claseNandaMapper;

    //get one
    @GetMapping("/findById/{idNanda}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idNanda") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<ClaseNandaDTO>> findAll() {
        var list = this.claseNandaService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.claseNandaMapper.toClaseNandaDTOList(list));
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
    @Autowired
    public void setClaseNandaMapper(ClaseNandaMapper claseNandaMapper) {
        this.claseNandaMapper = claseNandaMapper;
    }
}
