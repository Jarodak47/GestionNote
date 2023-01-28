package com.uy1.info.GestionNote.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "devoirs")
@AllArgsConstructor
@NoArgsConstructor
public class Devoir implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_type_note")
    private TypeNote typeNote;
    @Column(nullable = false)
    private String intitule;
    @Column
    private double valeur;
    @Column(nullable = false)
    private double pourcentage;


}
