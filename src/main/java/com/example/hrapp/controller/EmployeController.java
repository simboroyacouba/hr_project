package com.example.hrapp.controller;

import com.example.hrapp.entity.Employe;
import com.example.hrapp.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employes", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping
    public ResponseEntity<List<Employe>> getAllEmployes() {
        return new ResponseEntity<>(employeService.getAllEmployes(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employe> createEmploye(@RequestBody Employe employe) {
        return new ResponseEntity<>(employeService.saveEmploye(employe), HttpStatus.OK);
    }

    @GetMapping("/{guid}")
    public ResponseEntity<Employe> getEmployeById(@PathVariable String guid) {
        Employe employe = employeService.getEmployeById(guid);
        return new ResponseEntity<>(employe, HttpStatus.OK);
    }
}
