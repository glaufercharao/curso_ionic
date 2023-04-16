package com.gsamtecnologia.curso_ionic.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Getter
    @OneToMany(mappedBy = "estado") //mapeamento reverso
    @JsonBackReference
    private List<Cidade> cidades = new ArrayList<>();

}
