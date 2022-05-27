package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgence;
    public String nom;
    public String tel;
    public String fax;
    public String bp;
    public String adresse;
    //Une agence contient plusieur postes
@OneToMany(mappedBy = "agence")
    public Collection<Poste> postes;
//une agence contient plusieur utilisateur
    @OneToMany(mappedBy = "agence")
private  Collection<Utilisateur> utilisateurs;

}