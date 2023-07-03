package com.alura.alurabank.dominio;

import com.alura.alurabank.dominio.enun.Operacao;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class MovimentacaoConta {
    @JsonProperty
    private ContaCorrente conta;
    @JsonProperty
    private BigDecimal valor;
    @JsonProperty
    private Operacao operacao;


    public String getBanco() {
        return conta.getBanco();
    }

    public String getAgencia() {
        return conta.getAgencia();
    }

    public Integer getNumero() {
        return conta.getNumero();
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void executarEm(ContaCorrente contaCorrente) {
        contaCorrente.executar(operacao, valor);
    }
}
