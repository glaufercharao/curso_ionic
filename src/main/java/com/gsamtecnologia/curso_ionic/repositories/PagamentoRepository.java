package com.gsamtecnologia.curso_ionic.repositories;


import com.gsamtecnologia.curso_ionic.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
