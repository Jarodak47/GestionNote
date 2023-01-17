package com.uy1.info.GestionNote.entites;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Evaluation implements Serializable {
    private int EvaluationId;
    private Date date;


}
