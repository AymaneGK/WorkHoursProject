package com.ensa.tdeproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Entity
@AllArgsConstructor
public class Break implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private Date heureDebut;
    private Date heureFin;
    private String justification;

    public Break() {

    }

}
