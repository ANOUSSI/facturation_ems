package com.api.ems.service;

import com.api.ems.entity.Tarif;
import com.api.ems.exception.TarifNotFounfException;
import com.api.ems.repository.TarifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class TarifImp  implements Igestion<Tarif>  {
    private  TarifRepository tarifRepository;
    @Autowired
    public TarifImp(TarifRepository tarifRepository) {

        this.tarifRepository=tarifRepository;
    }

    //use this method to add a tariff
    @Override
    public Tarif add(Tarif objet) {
        return  this.tarifRepository.save(objet);
    }
    //use this methode to display a  tariff list
    @Override
    public List<Tarif> list(Tarif objet) {
        return this.tarifRepository.findAll();
    }
//this method allows you to modify a tariff
    @Override
    public Tarif update(Tarif objet,  long id) {
        Optional<Tarif> tarifupdate=this.tarifRepository.findById(id);
        if (!tarifupdate.isPresent()){
            throw new TarifNotFounfException(String.format("ce tarif  a mettre a jour n'existe pas"));
        }else
        return  this.tarifRepository.save(objet);
    }
    //this method allows you to search for a rate
    @Override
    public Optional<Tarif> getOne(long id) {
        Optional<Tarif>tarifOne=tarifRepository.findById(id);
        if (!tarifOne.isPresent()){
            throw  new TarifNotFounfException(String.format("le tarife a afficher n'existe pas"));
        }
        return this.tarifRepository.findById(id);
    }
    //this method makes it possible to verifyto delete a tariff
    @Override
    public void delete(Long id) {
        Optional<Tarif> tarifdelete=tarifRepository.findById(id);
        if (!tarifdelete.isPresent()){
            throw new TarifNotFounfException(String.format("le tarif a suprimer n'existe pas!"));
        }
this.tarifRepository.delete(tarifdelete.get());
    }

    @Override
    public Tarif print() {
        return null;
    }
}
