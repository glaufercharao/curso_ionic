package com.gsamtecnologia.curso_ionic.resources;

import com.gsamtecnologia.curso_ionic.dto.CategoriaDTO;
import com.gsamtecnologia.curso_ionic.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoriaDTO> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<CategoriaDTO> salvar(@RequestBody CategoriaDTO categoriaDTO){
        categoriaDTO = service.salvar(categoriaDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(categoriaDTO.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    @PutMapping
    public ResponseEntity<CategoriaDTO> atualizar(@RequestBody CategoriaDTO categoriaDTO){
        categoriaDTO = service.atualizar(categoriaDTO);
        return ResponseEntity.ok(categoriaDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
}
