package com.gsamtecnologia.curso_ionic.dto;

import com.gsamtecnologia.curso_ionic.entities.Cidade;
import lombok.Data;

@Data
public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private CidadeDTO cidade;
}
