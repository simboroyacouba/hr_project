package com.example.hrapp.controller;


import lombok.*;


@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeForm {

    private String guid;

    private String username;

    private String password;

    private String profilePhoto;

    private Boolean active;

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
