package com.example.hrapp.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "employes")
@Getter @Setter @NoArgsConstructor //@AllArgsConstructor
public class Employe extends Utilisateur {
 
    private String nom;

    private String prenom;

    private String email;

    private double salaire;

    private String poste;

    private String departement;

    private String dateEmbauche;

    private String adresse;
    
    private String telephone;
}
