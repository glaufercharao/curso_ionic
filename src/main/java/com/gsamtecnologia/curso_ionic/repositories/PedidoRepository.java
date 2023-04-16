package com.gsamtecnologia.curso_ionic.repositories;


import com.gsamtecnologia.curso_ionic.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}