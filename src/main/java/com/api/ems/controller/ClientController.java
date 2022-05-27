package com.api.ems.controller;

import com.api.ems.entity.Client;
import com.api.ems.exception.ClientNotFountException;
import com.api.ems.service.Igestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping(path = "apiRest",name = "gestion client")
@RestController
public class ClientController {
    @Autowired
    private Igestion<Client> gestion;
// this methode  allows you  to add a client


    public ClientController(Igestion<Client> gestion) {
        this.gestion = gestion;
    }
@ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/client",name = "create")
    public  Client  saveClient(@RequestBody Client client){
        return  this.gestion.add(client);
}
@ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/client",name = "liste client")
    public List<Client> clientList(Client client){
        return this.gestion.list(client);
}
//this method makes it possible to search for a customer
@ResponseStatus(HttpStatus.OK)
@GetMapping(path = "/client/{id}",name = "search client")
    public Optional<Client> searchClient( @PathVariable long id){

        return  this.gestion.getOne(id);
}
@ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "/client/{id}",name = "update")
    public Client updateClient(@RequestBody Client client,@PathVariable long id){
        return this.gestion.update(client,id);

}
@ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/client/{id}",name = "remove")
        public  void removeClient(@PathVariable long id){
        this.gestion.delete(id);

}

}
