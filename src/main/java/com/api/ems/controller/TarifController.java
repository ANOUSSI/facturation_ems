package com.api.ems.controller;


import com.api.ems.entity.Tarif;
import com.api.ems.repository.TarifRepository;
import com.api.ems.service.Igestion;
import com.api.ems.service.TarifImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "apiRest",name = "gestion des tarifs")
public class TarifController {

@Autowired
    private Igestion<Tarif> gestion;

    public TarifController(TarifImp tarifImp) {
        this.gestion = gestion;
    }
    @PostMapping(path="/tarif",name = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarif saveTarif(@RequestBody Tarif tarif){
        return this.gestion.add(tarif);
    }
    @GetMapping(path = "/tarif",name = "list")
    @ResponseStatus(HttpStatus.OK)
public List<Tarif > getList(Tarif tarif){

        return  this.gestion.list(tarif);
}
                                   //this method allows you to search for a rate
    @GetMapping(path = "/tarif/{id_tarif}",name = "search")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Tarif> searchOneTarif(@PathVariable Long id_tarif)
    {
        return  this.gestion.getOne(id_tarif);
    }
                                     //this method allows you to update a tariff

    @PutMapping(path = "/tarif/{id_tarif}",name = "modifier")
    @ResponseStatus(HttpStatus.OK)
    public Tarif updateTarif(@RequestBody Tarif tarif ,@PathVariable long id_tarif){
        return this.gestion.update(tarif,id_tarif);
    }
                  //this method makes it possible to remove a tariff, we have put the httpstatus.no content that returns us the code 204
    @DeleteMapping(path = "/tarif/{id_tarif}",name = "delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable long id_tarif){
        this.gestion.delete(id_tarif);
    }
}
