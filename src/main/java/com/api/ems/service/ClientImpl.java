package com.api.ems.service;

import com.api.ems.entity.Client;
import com.api.ems.exception.ClientNotFountException;
import com.api.ems.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientImpl implements  Igestion<Client>{
    @Autowired
    private ClientRepository clientRepository;

    public ClientImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client add(Client objet) {

        return this.clientRepository.save(objet);
    }

    @Override
    public List<Client> list(Client objet) {

        return this.clientRepository.findAll();
    }

    @Override
    public Client update(Client objet, long id) {

        Optional<Client> client=this.clientRepository.findById(id);
        if(!client.isPresent()){
            throw new ClientNotFountException(String.format("le client a modifier n'existe pas"));

        }
        return this.clientRepository.save(objet);
    }

    @Override
    public Optional<Client> getOne(long id) {
        Optional<Client> client =this.clientRepository.findById(id);
        if (!client.isPresent()){
            throw  new ClientNotFountException(String.format("le client recherger n'existe pas!"));
        }
        return this.clientRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<Client> client=this.clientRepository.findById(id);
        if (!client.isPresent()){
            throw  new ClientNotFountException(String.format("le clint a supprimer n'existe pas !"));
        }
this.clientRepository.delete(client.get());
    }

    @Override
    public Client print() {
        return null;
    }
}
