package com.api.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity    
public class FactureN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    private Date datefac;
    private  double avoir;
    private  String modePay;
}
