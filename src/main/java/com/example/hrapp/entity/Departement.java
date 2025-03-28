package com.example.hrapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "departements")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nom;

    private String description;

//    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
//    private List<Employe> employes;
}
