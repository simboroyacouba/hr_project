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
    public ResponseEntity<?> getAllEmployes() {
        return new ResponseEntity<>(employeService.getAllEmployes(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<?> createEmploye(@RequestBody EmployeForm employe) {
        Employe employe1 = new Employe();
        employe1.setNom(employe.getNom());
        employe1.setPrenom(employe.getPrenom());
        employe1.setEmail(employe.getEmail());
        employe1.setSalaire(employe.getSalaire());
        employe1.setPoste(employe.getPoste());
        employe1.setDepartement(employe.getDepartement());
        employe1.setAdresse(employe.getAdresse());
        employe1.setTelephone(employe.getTelephone());
        employe1.setPassword(employe.getPassword());
        employe1.setUsername(employe.getUsername());
        return new ResponseEntity<>(employeService.saveEmploye(employe1), HttpStatus.OK);
    }

    @GetMapping("/{guid}")
    public  ResponseEntity<?> getEmployeById(@PathVariable String guid) {
        Employe employe = employeService.getEmployeById(guid);
        return new ResponseEntity<>(employe, HttpStatus.OK);
    }
}
