package com.gsamtecnologia.curso_ionic.services;

import com.gsamtecnologia.curso_ionic.dto.PedidoDTO;
import com.gsamtecnologia.curso_ionic.dto.ProdutoDTO;
import com.gsamtecnologia.curso_ionic.entities.Pedido;
import com.gsamtecnologia.curso_ionic.entities.Produto;
import com.gsamtecnologia.curso_ionic.mapper.Mappable;
import com.gsamtecnologia.curso_ionic.repositories.PedidoRepository;
import com.gsamtecnologia.curso_ionic.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService implements Mappable {

    private final PedidoRepository repository;

    public List<PedidoDTO> listarTodos(){
        return map(repository.findAll(),PedidoDTO.class);
    }

    public PedidoDTO buscarPorId(Long id){
        return map(repository.findById(id),PedidoDTO.class);
    }

    public PedidoDTO salvar(PedidoDTO produtoDTO){
        return map(repository.save(map(produtoDTO, Pedido.class)),PedidoDTO.class);
    }

    public PedidoDTO atualizar(PedidoDTO pedidoDTO){

        if(pedidoDTO.getId() == null){
            throw new RuntimeException("ID do produto inexistente.");
        }
         if(!repository.existsById(pedidoDTO.getId())){
             throw new RuntimeException("ID do produto invalido.");
         }

        return map(repository.save(map(pedidoDTO, Pedido.class)),PedidoDTO.class);
    }

    public void remover(Long id){

        if(!repository.existsById(id)){
            throw new RuntimeException("ID do produto invalido.");
        }
        repository.deleteById(id);
    }
}
