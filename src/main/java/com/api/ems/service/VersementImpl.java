package com.api.ems.service;

import com.api.ems.entity.Versement;
import com.api.ems.exception.VersementNotFountException;
import com.api.ems.repository.VersementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VersementImpl  implements  Igestion<Versement>{
    @Autowired
    private VersementRepository versementRepository;

    public VersementImpl(VersementRepository versementRepository) {
        this.versementRepository = versementRepository;
    }

    @Override
    public Versement add(Versement objet) {
        return this.versementRepository.save(objet);
    }

    @Override
    public List<Versement> list(Versement objet) {
        return this.versementRepository.findAll();
    }

    @Override
    public Versement update(Versement objet, long id) {
        Optional<Versement> versement=this.versementRepository.findById(id);
        if (!versement.isPresent()){
            throw  new VersementNotFountException(String.format("le mersement a modifier n'existe pas"));
        }
        return this.versementRepository.save(objet);
    }

    @Override
    public Optional<Versement> getOne(long id) {
        Optional<Versement> versement=this.versementRepository.findById(id);
        if (!versement.isPresent()){
            throw new VersementNotFountException(String.format("le versement rechercher n'existe pas"));
        }
        return this.versementRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<Versement> versement =this.versementRepository.findById(id);
        if (!versement.isPresent()){
            throw new VersementNotFountException(String.format("le versement que vous vollez supprimer n'existe pas"));
        }
this.versementRepository.delete(versement.get());
    }

    @Override
    public Versement print() {
        return null;
    }
}
