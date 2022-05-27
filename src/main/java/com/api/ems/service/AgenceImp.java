package com.api.ems.service;

import com.api.ems.entity.Agence;
import com.api.ems.entity.Tarif;
import com.api.ems.exception.AgenceNotFounfException;
import com.api.ems.repository.AgenceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceImp implements  Igestion<Agence>{

    private AgenceRespository agenceRespository;
@Autowired
    public AgenceImp(AgenceRespository agenceRespository) {
        this.agenceRespository = agenceRespository;
    }



    @Override
    public Agence add(Agence objet) {
        return this.agenceRespository.save(objet);
    }

    @Override
    public List<Agence> list(Agence objet) {
        return  this.agenceRespository.findAll();
    }
//this method is used to update an agency
    @Override
    public Agence update(Agence objet, long id) {
        Optional<Agence> agence=this.agenceRespository.findById(id);
if (!agence.isPresent()){
    throw new AgenceNotFounfException(String.format("l'agence a mettre a jour nest pas disponible"));
}
        return this.agenceRespository.save(objet);
    }

    @Override
    public Optional<Agence> getOne(long id) {
        Optional<Agence> agence= this.agenceRespository.findById(id);
        if (!agence.isPresent()){
            throw  new AgenceNotFounfException(String.format("l'agence  que vous rechercher n'existe pas"));
        }
        return this.agenceRespository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<Agence>agence=this.agenceRespository.findById(id);
        if (!agence.isPresent()){
            throw  new AgenceNotFounfException(String.format("l'agence a suprimer n'esxiste pas"));
        }
this.agenceRespository.delete(agence.get());
    }

    @Override
    public Agence print() {
        return null;
    }
}
