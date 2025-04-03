package com.example.hrapp.service;

import com.example.hrapp.entity.Employe;
import com.example.hrapp.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Transactional
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe getEmployeById(String guid) {
        return employeRepository.findById(guid).orElse(null);
    }
}
