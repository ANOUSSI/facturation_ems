package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public   class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String raisonS;
    private int codeType;
    private int codeModeleFac;
    private  String adresse;
    private  String bp;
    private  String ville;
    private  String pays;
    private  String mobile;
    private String fixe;
    private  String fax;
    private  String email;
    private  String numContribuable;
    private  String regCommerce;
    private  String rib;
    private  int solde;
    private  boolean isTva;
    private boolean isIR;
    private  int remise;

}
