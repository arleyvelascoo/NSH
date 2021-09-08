package com.nsh.project.controller;

import com.nsh.project.dto.TipoCaracteristicaDTO;
import com.nsh.project.mapper.TipoCaracteristicaMapper;
import com.nsh.project.service.interfaces.ITipoCaracteristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoCaracteristica")
public class TipoCaracteristicaController {

    private ITipoCaracteristicaService tipoCaracteristicaService;
    private TipoCaracteristicaMapper tipoCaracteristicaMapper;

    //get one
    @GetMapping("/findById/{idTipoCaracteristica}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idTipoCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<TipoCaracteristicaDTO>> findAll() {
        var list = this.tipoCaracteristicaService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.tipoCaracteristicaMapper.toTipoCaracteristicaDTOList(list));
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
    @Autowired
    public void setTipoCaracteristicaMapper(TipoCaracteristicaMapper tipoCaracteristicaMapper) {
        this.tipoCaracteristicaMapper = tipoCaracteristicaMapper;
    }
}
