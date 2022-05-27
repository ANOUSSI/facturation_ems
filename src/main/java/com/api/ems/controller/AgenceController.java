
package com.api.ems.controller;


import com.api.ems.entity.Agence;
import com.api.ems.service.AgenceImp;
import com.api.ems.service.Igestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "apiRest",name = "gestion agence")

public class AgenceController {
    @Autowired
    private Igestion<Agence> gestion;

    public AgenceController(AgenceImp agenceImp) {
        this.gestion = gestion;
    }

    @PostMapping(path = "/agence",name = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public  Agence saveAgence(@RequestBody Agence agence){
        return this.gestion.add(agence);
    }

    @GetMapping(path = "/agence",name = "liste agence")
    @ResponseStatus(HttpStatus.OK)
  public List<Agence> listAgence(Agence agence)  {
        return this.gestion.list(agence);
    }

    @GetMapping(path = "/agence{/id}",name = "search agence")
@ResponseStatus(HttpStatus.OK)
    public Optional<Agence> serachOne(@PathVariable long id){
        return  this.gestion.getOne(id);
}


    @PutMapping(path = "/agence/{id}",name = "update agence")
    @ResponseStatus(HttpStatus.OK)
    public  Agence updateAgence(@RequestBody Agence agence,long id) {
        return  this.gestion.update(agence,id);
}

@DeleteMapping(path = "/agence",name = "supprimer une agence")
@ResponseStatus(HttpStatus.NO_CONTENT)
public  void  removeAgence(@PathVariable long id) {
    this.gestion.delete(id);
}



}
