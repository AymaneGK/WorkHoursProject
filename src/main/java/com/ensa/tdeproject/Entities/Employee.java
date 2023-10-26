package com.ensa.tdeproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Entity
@Table(name = "Employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String poste;
    private String num_tel;
    private String address;
    public void setId(int id) {
        this.id = id;
    }

}
