package com.uy1.info.GestionNote.entites;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Etudiant implements Serializable {
    private int etudiantId;
    private String nom;
    private String prenom;
    private String matricule;


}
