package com.gsamtecnologia.curso_ionic.services;

import com.gsamtecnologia.curso_ionic.dto.ProdutoDTO;
import com.gsamtecnologia.curso_ionic.entities.Produto;
import com.gsamtecnologia.curso_ionic.mapper.Mappable;
import com.gsamtecnologia.curso_ionic.entities.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService implements Mappable {

    private final ProdutoRepository repository;

    public List<ProdutoDTO> listarTodos(){
        return map(repository.findAll(),ProdutoDTO.class);
    }

    public ProdutoDTO buscarPorId(Long id){
        return map(repository.findById(id),ProdutoDTO.class);
    }

    public ProdutoDTO salvar(ProdutoDTO produtoDTO){
        return map(repository.save(map(produtoDTO, Produto.class)),ProdutoDTO.class);
    }

    public ProdutoDTO atualizar(ProdutoDTO produtoDTO){

        if(produtoDTO.getId() == null){
            throw new RuntimeException("ID do produto inexistente.");
        }
         if(!repository.existsById(produtoDTO.getId())){
             throw new RuntimeException("ID do produto invalido.");
         }

        return map(repository.save(map(produtoDTO, Produto.class)),ProdutoDTO.class);
    }

    public void remover(Long id){

        if(!repository.existsById(id)){
            throw new RuntimeException("ID do produto invalido.");
        }
        repository.deleteById(id);
    }
}
