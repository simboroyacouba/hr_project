package com.example.hrapp.service;

import com.example.hrapp.entity.Departement;
import com.example.hrapp.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;


@Service
public class DepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    @Transactional
    public Departement saveDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    public Departement getDepartementById(Long id) {
        return departementRepository.findById(id).orElse(null);
    }
}
