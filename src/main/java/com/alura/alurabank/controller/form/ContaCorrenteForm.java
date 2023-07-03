package com.alura.alurabank.controller.form;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContaCorrenteForm {

    @JsonProperty
    private String banco;
    @JsonProperty
    private String agencia;
    @JsonProperty
    private Integer numero;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
