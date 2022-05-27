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
public class Versement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  int ref;
    private  String  libele;
}
