package com.gsamtecnologia.curso_ionic.repositories;

import com.gsamtecnologia.curso_ionic.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
