package com.api.ems.repository;

import com.api.ems.entity.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends JpaRepository<Poste,Long> {
}
