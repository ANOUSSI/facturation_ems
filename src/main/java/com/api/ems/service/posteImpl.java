package com.api.ems.service;

import com.api.ems.entity.Poste;
import com.api.ems.exception.PosteNotFounfException;
import com.api.ems.repository.PosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class posteImpl implements   Igestion<Poste>{
    @Autowired
    private PosteRepository posteRepository;

    public posteImpl(PosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    @Override
    public Poste add(Poste objet) {
        return this.posteRepository.save(objet);
    }

    @Override
    public List<Poste> list(Poste objet) {
        return this.posteRepository.findAll();
    }

    @Override
    public Poste update(Poste objet, long id) {
        Optional<Poste> poste=this.posteRepository.findById(id);
        if (!poste.isPresent()){
            throw  new PosteNotFounfException(String.format("le poste a modifier n'existe pas"));
        }
        return this.posteRepository.save(objet);
    }

    @Override
    public Optional<Poste> getOne(long id) {
        Optional<Poste> poste=this.posteRepository.findById(id);
        if (!poste.isPresent()){
            throw new PosteNotFounfException(String.format("le poste rechercher n'existe pas"));
        }
        return this.posteRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<Poste> poste =this.posteRepository.findById(id);
        if (!poste.isPresent()){
            throw new PosteNotFounfException(String.format("le poste que vousllez supprimer n'existe pas"));
        }
            this.posteRepository.delete(poste.get());



    }

    @Override
    public Poste print() {
        return null;
    }
}
