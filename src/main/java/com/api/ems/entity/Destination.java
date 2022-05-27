package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Destination {
    //@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int codeDes;
    private String nomDes;
    private String zoneDes;
    private List<Agence> emsCollection;
    }
