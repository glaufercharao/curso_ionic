package com.gsamtecnologia.curso_ionic.services;

import com.gsamtecnologia.curso_ionic.dto.CategoriaDTO;
import com.gsamtecnologia.curso_ionic.entities.Categoria;
import com.gsamtecnologia.curso_ionic.mapper.Mappable;
import com.gsamtecnologia.curso_ionic.repositories.CategoriaRepository;
import com.gsamtecnologia.curso_ionic.services.exception.DataIntegretyException;
import com.gsamtecnologia.curso_ionic.services.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
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
        return map(repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID: "+ id)),CategoriaDTO.class);
    }

    public CategoriaDTO salvar(CategoriaDTO categoriaDTO){
        return map(repository.save(map(categoriaDTO, Categoria.class)),CategoriaDTO.class);
    }

    public CategoriaDTO atualizar(CategoriaDTO categoriaDTO){

        if(categoriaDTO.getId() == null){
            throw new ObjectNotFoundException("ID do categoria inexistente.");
        }
         if(!repository.existsById(categoriaDTO.getId())){
             throw new ObjectNotFoundException("ID do categoria invalido.");
         }

        return map(repository.save(map(categoriaDTO, Categoria.class)),CategoriaDTO.class);
    }

    public void remover(Long id){
        buscarPorId(id);
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DataIntegretyException("Não é possivel excluir categoria associada a um produto");
        }

    }
}
