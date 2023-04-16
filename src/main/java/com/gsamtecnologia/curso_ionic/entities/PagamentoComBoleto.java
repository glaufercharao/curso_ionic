package com.gsamtecnologia.curso_ionic.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
public class PagamentoComBoleto extends Pagamento{
    private static final long serialVersionUID = 1L;

    private Instant dataVencimento;
    private Instant dataPagamento;
}
