package com.alura.alurabank.dominio.enun;

import java.math.BigDecimal;

public enum Operacao {
    DEPOSITO{
        @Override
        public BigDecimal executar(BigDecimal saldo, BigDecimal valor) {
            return saldo.add(valor);
        }
    }, SAQUE {
        @Override
        public BigDecimal executar(BigDecimal saldo, BigDecimal valor) {
            return saldo.subtract(valor);
        }
    };

    public abstract BigDecimal executar(BigDecimal saldo, BigDecimal valor);
}
