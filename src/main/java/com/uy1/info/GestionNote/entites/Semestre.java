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
public class Semestre implements Serializable {
   private int semestreId;
   private int code; //exemple semestre 1,code=1

}
