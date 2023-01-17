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
public class UE implements Serializable {
    private int ueId;
    private String intitule;

}
