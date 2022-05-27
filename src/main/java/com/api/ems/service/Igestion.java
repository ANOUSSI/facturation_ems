package com.api.ems.service;

import com.api.ems.entity.Tarif;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface Igestion<T> {
        T add(T objet);
        List<T> list(T objet);
        T update(T objet,long id);
    Optional<T> getOne(long id);
    void delete(Long id);
    public T print();

    }
