package com.example.hrapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "formations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Date dateDebut;
    private Date dateFin;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;
}
