package com.gsamtecnologia.curso_ionic.services.exception;

import lombok.Data;

@Data
public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String menssagem){
        super(menssagem);
    }

    public ObjectNotFoundException(String menssagem,Throwable cause){
        super(menssagem, cause);
    }
}
