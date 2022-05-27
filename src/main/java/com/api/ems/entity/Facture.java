package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Facture
{
    private  String numFac;
    private long codeClient;
    private Data dateFac;

    public String getNumFac() {
        return numFac;
    }

    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }

    public long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(long codeClient) {
        this.codeClient = codeClient;
    }

    public Data getDateFac() {
        return dateFac;
    }

    public void setDateFac(Data dateFac) {
        this.dateFac = dateFac;
    }
}
