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
public class Note implements Serializable {
    private int noteId;
    private double valeur;
    private double coef;





}
