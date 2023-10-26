package com.ensa.tdeproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Getter;
import org.antlr.v4.runtime.Token;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "WorkHours")
public class WorkHour implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Employee employee;
    private Date date;
    private Date heureDebut;
    private Date heureFin;
    private String humeur;
    @OneToMany(mappedBy = "workHour") // Use the mappedBy attribute to link the relationship
    private List<Break> breaks;
    @OneToOne
    private EmailToken emailToken;


}
