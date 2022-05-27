package com.api.ems.controller;

import com.api.ems.entity.Versement;
import com.api.ems.service.Igestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping(path = "apiRest",name = "gestion des payement")
@RestController
public class VersementController {
    @Autowired
    private Igestion<Versement>  gestion;

    public VersementController(Igestion<Versement> gestion) {
        this.gestion = gestion;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/vsmt",name = "create")
    public Versement saveVsmt(@RequestBody Versement versement){
        return  this.gestion.add(versement);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "vsmt",name = "list  payement")
    public List<Versement> versementList(Versement versement){
        return  this.gestion.list(versement);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/vsmt/{id}",name = "One payement ")
    public Optional<Versement> oneVersement(@PathVariable long id){
        return  this.gestion.getOne(id);
    }
@ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/vsmt/{id}",name = "update payement")
    public   Versement upadateVesement( @RequestBody Versement versement,@PathVariable long id){
        return  this.gestion.update(versement,id);
}
@ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/vsmt/{id}",name = "remove payement")
public  void  removePayement(@PathVariable long id){


        this.gestion.delete(id);
    }
}
