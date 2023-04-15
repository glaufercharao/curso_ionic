package com.gsamtecnologia.curso_ionic.entities.repositories;

import com.gsamtecnologia.curso_ionic.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
