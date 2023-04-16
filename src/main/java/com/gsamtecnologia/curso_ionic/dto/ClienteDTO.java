package com.gsamtecnologia.curso_ionic.dto;

import com.gsamtecnologia.curso_ionic.entities.Endereco;
import com.gsamtecnologia.curso_ionic.enums.TipoCliente;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    private TipoCliente tipoCliente;
    private List<EnderecoDTO> enderecos;
    private Set<String> telefones;
}
