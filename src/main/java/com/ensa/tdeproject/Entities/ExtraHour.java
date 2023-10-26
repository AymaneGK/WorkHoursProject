package com.ensa.tdeproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Entity
@AllArgsConstructor
public class ExtraHour implements Serializable {

    @Id
    @GeneratedValue

    private int id;
    private Date heureDebut;
    private Date heureFin;
    private String cause;
    @ManyToOne
    @JoinColumn(name = "idWorkHour")
    private WorkHour workhour;

    public ExtraHour() {

    }

}
