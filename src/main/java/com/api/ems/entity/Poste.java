package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public  class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idPost;
    private  int numero;
    private  String designation; 
    private  long idAgence;
    //un poste est ratacher a une agence
    @ManyToOne()
    @JoinColumn(name = "agence_fk")
    private  Agence agence;

}
