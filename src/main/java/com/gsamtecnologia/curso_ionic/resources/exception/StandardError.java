package com.gsamtecnologia.curso_ionic.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private int status;
    private String menssagem;
    private Long timeStamp;
}
