package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groupe {
    private long idGrp;
    private  String libele;
    private  String description;
    private List<Droit> droits;

}
