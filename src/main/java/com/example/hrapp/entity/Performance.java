package com.example.hrapp.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "performances")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    private Date dateEvaluation;
    private Double note;
    private String commentaires;
}
