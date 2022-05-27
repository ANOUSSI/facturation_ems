package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public  class Tarif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idTarif;
    private  int poidSup;
    private int poidInf;
    private  int puz1;
    private int puz2;
    private  int puz3;


    }

