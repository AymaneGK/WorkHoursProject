package com.ensa.tdeproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Entity
@AllArgsConstructor
public class EmailToken implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String token;
    private boolean expired;

    public EmailToken() {

    }

}
