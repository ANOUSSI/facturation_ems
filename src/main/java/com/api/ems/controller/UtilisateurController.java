package com.api.ems.controller;

import com.api.ems.entity.Utilisateur;
import com.api.ems.service.Igestion;
import com.api.ems.service.UtilisateurImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "apiRest",name = "gestion user")
public class UtilisateurController {
    @Autowired
    private Igestion<Utilisateur>  gestion;

    public UtilisateurController(UtilisateurImpl utilisateurImpl) {
        this.gestion = gestion;
    }

    @PostMapping(path = "/user",name = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public  Utilisateur saveuse(@RequestBody Utilisateur utilisateur){
        return  this.gestion.add(utilisateur);
    }

    @GetMapping(path = "/user",name = "get liste")
    @ResponseStatus(HttpStatus.OK)
    public List<Utilisateur> getlistUser(Utilisateur utilisateur){
        return this.gestion.list(utilisateur);
    }

    @GetMapping(path = "/user/{id}",name = "search")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Utilisateur> searchUser(@PathVariable long id)
    {
        return this.gestion.getOne(id);
    }

    @PutMapping(path = "/user/{id}",name = "update user")
    @ResponseStatus(HttpStatus.OK)
    public  Utilisateur updateUser(@RequestBody Utilisateur utilisateur,@PathVariable long id){
        return this.gestion.update(utilisateur,id);
    }
    @DeleteMapping(path = "/user/{id}",name = "deleted")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void  remove(@PathVariable long id){
        this.gestion.delete(id);
    }

}
