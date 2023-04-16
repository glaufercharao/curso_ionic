package com.gsamtecnologia.curso_ionic.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class PedidoDTO {
    private Long id;
    private Instant date;
}
