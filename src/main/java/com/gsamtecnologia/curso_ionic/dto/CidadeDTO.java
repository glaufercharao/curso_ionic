package com.gsamtecnologia.curso_ionic.dto;

import com.gsamtecnologia.curso_ionic.entities.Estado;
import lombok.Data;

@Data
public class CidadeDTO {
    private Long id;
    private String nome;
    private EstadoDTO estado;
}
