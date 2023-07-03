package com.alura.alurabank.dominio.enun;

import java.math.BigDecimal;

public enum TipoInvestimento {

    POUPANCA(new BigDecimal("0.005")),
    FUNDO_INVESTIMENTO(new BigDecimal("0.015")),
    CDI(new BigDecimal("0.016"));

    private BigDecimal rendimento;
    TipoInvestimento(BigDecimal rendimento) {
        this.rendimento = rendimento;
    }

    public BigDecimal render(BigDecimal salario){
        BigDecimal soma = salario.add( salario.multiply(this.rendimento) );
        return soma;
    }
}
