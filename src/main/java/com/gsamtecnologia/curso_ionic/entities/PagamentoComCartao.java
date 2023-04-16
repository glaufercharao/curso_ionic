package com.gsamtecnologia.curso_ionic.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID = 1L;

    private Integer quantidadeParcela;
}
