package com.gsamtecnologia.curso_ionic.services;

import com.gsamtecnologia.curso_ionic.dto.ClienteDTO;
import com.gsamtecnologia.curso_ionic.entities.Cliente;
import com.gsamtecnologia.curso_ionic.repositories.ClienteRepository;
import com.gsamtecnologia.curso_ionic.mapper.Mappable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService implements Mappable {

    private final ClienteRepository repository;

    public List<ClienteDTO> listarTodos(){
        return map(repository.findAll(),ClienteDTO.class);
    }

    public ClienteDTO buscarPorId(Long id){
        return map(repository.findById(id),ClienteDTO.class);
    }

    public ClienteDTO salvar(ClienteDTO produtoDTO){
        return map(repository.save(map(produtoDTO, Cliente.class)),ClienteDTO.class);
    }

    public ClienteDTO atualizar(ClienteDTO clienteDTO){

        if(clienteDTO.getId() == null){
            throw new RuntimeException("ID do produto inexistente.");
        }
         if(!repository.existsById(clienteDTO.getId())){
             throw new RuntimeException("ID do produto invalido.");
         }

        return map(repository.save(map(clienteDTO, Cliente.class)),ClienteDTO.class);
    }

    public void remover(Long id){

        if(!repository.existsById(id)){
            throw new RuntimeException("ID do produto invalido.");
        }
        repository.deleteById(id);
    }
}
