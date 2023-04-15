package com.gsamtecnologia.curso_ionic.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Getter
    @JsonManagedReference // Informa que listara os objetos associados.
    @ManyToMany(mappedBy = "categorias")
    private List<Produto> produtos = new ArrayList<>();

}
