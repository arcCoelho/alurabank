package com.alura.alurabank.dominio;

import java.math.BigDecimal;

public class Investimento {

    private String tpInvestimento;
    private ContaCorrente conta;

    public Investimento(String tpInvestimento, ContaCorrente conta) {
        this.tpInvestimento = tpInvestimento;
        this.conta = conta;
    }

    public String getTpInvestimento() {
        return tpInvestimento;
    }

    public void setTpInvestimento(String tpInvestimento) {
        this.tpInvestimento = tpInvestimento;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public BigDecimal getSaldo(){
        return this.getConta().getSaldo();
    }
}
