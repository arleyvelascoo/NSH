package com.nsh.project.controller;

import com.nsh.project.dto.CaracteristicaDTO;
import com.nsh.project.mapper.CatacteristicaMapper;
import com.nsh.project.service.interfaces.ICaracteristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/caracteristica")
public class CaracteristicaController {

    private ICaracteristicaService caracteristicaService;
    private CatacteristicaMapper catacteristicaMapper;

    //get one
    @GetMapping("/findById/{idCaracteristica}")
    public ResponseEntity<?> findById(
            @PathVariable(name = "idCaracteristica") Long aIdTipoCP) {
        return ResponseEntity.ok(true);
    }

    //get all
    @GetMapping("/findAll")
    public ResponseEntity<List<CaracteristicaDTO>> findAll() {
        var list = this.caracteristicaService.getAll();
        if (list == null || list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok(this.catacteristicaMapper.toCaracteristicaDTOList(list));
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
    @Autowired
    public void setCatacteristicaMapper(CatacteristicaMapper catacteristicaMapper) {
        this.catacteristicaMapper = catacteristicaMapper;
    }
}
