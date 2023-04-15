package com.gsamtecnologia.curso_ionic.entities.repositories;


import com.gsamtecnologia.curso_ionic.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
