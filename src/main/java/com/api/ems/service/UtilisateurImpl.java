package com.api.ems.service;

import com.api.ems.entity.Utilisateur;
import com.api.ems.exception.AgenceNotFounfException;
import com.api.ems.exception.UtilisateurNotFounfException;
import com.api.ems.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UtilisateurImpl implements Igestion<Utilisateur> {
    @Autowired
    private  UtilisateurRepository utilisateurRepository;

    public UtilisateurImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur add(Utilisateur objet) {
        return  this.utilisateurRepository.save(objet);
    }

    @Override
    public List<Utilisateur> list(Utilisateur objet) {
        return this.utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur update(Utilisateur objet, long id) {
        Optional<Utilisateur> utilisateur=this.utilisateurRepository.findById(id);
        if (!utilisateur.isPresent()){
            throw new UtilisateurNotFounfException(String.format("l'utilisateur que vous voullez mettre a jour nexiste pas"));
        }
        return this.utilisateurRepository.save(objet);
    }

    @Override
    public Optional<Utilisateur> getOne(long id) {
        Optional<Utilisateur> searchUtilisateur= this.utilisateurRepository.findById(id);
                if (!searchUtilisateur.isPresent()){
                    throw new UtilisateurNotFounfException(String.format("l'utilisateur rechercher n'existe pas"));
                }else

        return this.utilisateurRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<Utilisateur> usedelete=this.utilisateurRepository.findById(id);
        if (!usedelete.isPresent()){
           throw new UtilisateurNotFounfException(String.format("cette utilisateur n'existe pas")) ;
        }
        this.utilisateurRepository.delete(usedelete.get());
    }

    @Override
    public Utilisateur print() {
        return null;
    }
}

