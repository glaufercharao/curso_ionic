package com.gsamtecnologia.curso_ionic.resources;

import com.gsamtecnologia.curso_ionic.dto.ClienteDTO;
import com.gsamtecnologia.curso_ionic.dto.PedidoDTO;
import com.gsamtecnologia.curso_ionic.services.ClienteService;
import com.gsamtecnologia.curso_ionic.services.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    private final PedidoService service;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> listar(){
        return ResponseEntity.ok().body(service.listarTodos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PedidoDTO> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }
}
