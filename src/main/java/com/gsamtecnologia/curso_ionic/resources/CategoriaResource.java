package com.gsamtecnologia.curso_ionic.resources;

import com.gsamtecnologia.curso_ionic.dto.CategoriaDTO;
import com.gsamtecnologia.curso_ionic.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    private final CategoriaService service;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> listar(){
        return ResponseEntity.ok().body(service.listarTodos());
    }
}
