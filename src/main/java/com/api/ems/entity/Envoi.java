package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public  abstract class Envoi {
    private   String numEnvoi;
    private  long codeAgClient;
    private long CodeAgCollecte;
    private  Destination origine;
    private Destination destination;
    private double poidR;
    private double poidV;
    private long longueur;
    private  long largeur;
    private  long epesseur;
    private float prix;
    private boolean accR;



    }

