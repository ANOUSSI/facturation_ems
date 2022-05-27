package com.api.ems.controller;

import com.api.ems.entity.Poste;
import com.api.ems.service.Igestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "apiRest",name = "gestion poste")
public class PosteController {
    @Autowired
    private Igestion<Poste> gestion;

    public PosteController(Igestion<Poste> gestion) {
        this.gestion = gestion;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/poste",name = "create")
    public  Poste saveposte(@RequestBody Poste poste){
        return this.gestion.add(poste);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/poste",name = "liste")
    public List<Poste> PostList(Poste poste){
        return  this.gestion.list(poste);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/poste/{id}",name = "search")
    public Optional<Poste> searchPoste(long id){
        return this.gestion.getOne(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/poste/{id}",name = "update")
    public Poste updatePoste(@RequestBody Poste poste,@PathVariable long id){
        return this.gestion.update(poste,id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(path = "poste/{id}",name = "remove")
    public void  removePoste(@PathVariable long id){
        this.gestion.delete(id);
    }
}
