package com.gsamtecnologia.curso_ionic.services;

import com.gsamtecnologia.curso_ionic.dto.CategoriaDTO;
import com.gsamtecnologia.curso_ionic.entities.Categoria;
import com.gsamtecnologia.curso_ionic.mapper.Mappable;
import com.gsamtecnologia.curso_ionic.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService implements Mappable {

    private final CategoriaRepository repository;

    public List<CategoriaDTO> listarTodos(){
        return map(repository.findAll(),CategoriaDTO.class);
    }

    public CategoriaDTO buscarPorId(Long id){
        return map(repository.findById(id),CategoriaDTO.class);
    }

    public CategoriaDTO salvar(CategoriaDTO categoriaDTO){
        return map(repository.save(map(categoriaDTO, Categoria.class)),CategoriaDTO.class);
    }

    public CategoriaDTO atualizar(CategoriaDTO categoriaDTO){

        if(categoriaDTO.getId() == null){
            throw new RuntimeException("ID do Usuário inexistente.");
        }
         if(!repository.existsById(categoriaDTO.getId())){
             throw new RuntimeException("ID do usuário invalido.");
         }

        return map(repository.save(map(categoriaDTO, Categoria.class)),CategoriaDTO.class);
    }

    public void remover(Long id){

        if(!repository.existsById(id)){
            throw new RuntimeException("ID do usuário invalido.");
        }
        repository.deleteById(id);
    }
}
