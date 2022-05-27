package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Droit {
    private  long idDroit;
    private String  menu;
    private  String description;
    private   boolean afficher;
    private  boolean ajouter;
    private  boolean modifier;
    private  boolean suprimer;
    private  boolean valider;
    private   boolean imprimer;

public  int  sauvegarder(){
    return 1;
}

    public long getIdDroit() {
        return idDroit;
    }

    public void setIdDroit(long idDroit) {
        this.idDroit = idDroit;
    }

    public String getManu() {
        return menu;
    }

    public void setManu(String manu) {
        this.menu = manu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAfficher() {
        return afficher;
    }

    public void setAfficher(boolean afficher) {
        this.afficher = afficher;
    }

    public boolean isAjouter() {
        return ajouter;
    }

    public void setAjouter(boolean ajouter) {
        this.ajouter = ajouter;
    }

    public boolean isModifier() {
        return modifier;
    }

    public void setModifier(boolean modifier) {
        this.modifier = modifier;
    }

    public boolean isSuprimer() {
        return suprimer;
    }

    public void setSuprimer(boolean suprimer) {
        this.suprimer = suprimer;
    }

    public boolean isValider() {
        return valider;
    }

    public void setValider(boolean valider) {
        this.valider = valider;
    }

    public boolean isImprimer() {
        return imprimer;
    }

    public void setImprimer(boolean imprimer) {
        this.imprimer = imprimer;
    }
}
