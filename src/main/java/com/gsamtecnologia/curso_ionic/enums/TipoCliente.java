package com.gsamtecnologia.curso_ionic.enums;


public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Juridica");

    private int codigo;
    private String descricao;

    TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer codigo) {
        if(codigo == null){
            return null;
        }
        for (TipoCliente x: TipoCliente.values()) {
            if(codigo.equals(x.getCodigo())){
                return x;
            }
        }
        throw  new IllegalArgumentException("Codigo invalido");
    }
}
