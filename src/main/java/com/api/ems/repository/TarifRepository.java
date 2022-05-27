package com.api.ems.repository;

import com.api.ems.entity.Tarif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifRepository extends JpaRepository<Tarif,Long> {


}
