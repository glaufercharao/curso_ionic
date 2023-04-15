package com.gsamtecnologia.curso_ionic.entities.repositories;

import com.gsamtecnologia.curso_ionic.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
