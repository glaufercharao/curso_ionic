package com.gsamtecnologia.curso_ionic.entities.repositories;

import com.gsamtecnologia.curso_ionic.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}