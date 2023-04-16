package com.gsamtecnologia.curso_ionic.services.exception;

import lombok.Data;

@Data
public class DataIntegretyException extends RuntimeException {
    public DataIntegretyException(String menssagem){
        super(menssagem);
    }

    public DataIntegretyException(String menssagem, Throwable cause){
        super(menssagem, cause);
    }
}
