package com.example.hrapp.controller;

import com.example.hrapp.entity.Departement;
import com.example.hrapp.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/departements", produces = MediaType.APPLICATION_JSON_VALUE)
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @GetMapping
    public ResponseEntity<?> getAllDepartements() {
        return new ResponseEntity<>(departementService.getAllDepartements(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createDepartement(@RequestBody Departement departement) {
        return new ResponseEntity<>(departementService.saveDepartement(departement), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDepartementById(@PathVariable Long id) {
        return new ResponseEntity<>(departementService.getDepartementById(id), HttpStatus.OK);
    }
}
