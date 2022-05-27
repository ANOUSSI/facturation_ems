package com.api.ems.entity;

public class FactureAvoir {

    private String designation;
    private float mntHT;
    private float mntTTC;

    public float getMntTTC() {
        return mntTTC;
    }

    public void setMntTTC(float mntTTC) {
        this.mntTTC = mntTTC;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getMntHT() {
        return mntHT;
    }

    public void setMntHT(float mntHT) {
        this.mntHT = mntHT;
    }
}
