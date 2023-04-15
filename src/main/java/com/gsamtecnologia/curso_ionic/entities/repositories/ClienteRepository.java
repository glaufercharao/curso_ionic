package com.gsamtecnologia.curso_ionic.entities.repositories;


import com.gsamtecnologia.curso_ionic.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
