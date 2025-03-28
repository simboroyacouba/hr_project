package com.example.hrapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "conges")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    private String typeConge;
    private Date dateDebut;
    private Date dateFin;

    @Enumerated(EnumType.STRING)
    private StatusConge status;
}

enum StatusConge {
    EN_ATTENTE, APPROUVE, REFUSE
}
