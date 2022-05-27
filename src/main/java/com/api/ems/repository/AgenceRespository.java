package com.api.ems.repository;

import com.api.ems.entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRespository extends JpaRepository <Agence,Long>{
}
