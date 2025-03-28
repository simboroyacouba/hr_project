package com.example.hrapp.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "employes")
@Getter @Setter @NoArgsConstructor //@AllArgsConstructor
public class Employe extends Utilisateur {

}
