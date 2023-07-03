package com.alura.alurabank.dominio;

import com.alura.alurabank.dominio.enun.Operacao;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaCorrente {
    @JsonProperty
    private String banco;
    @JsonProperty
    private String agencia;
    @JsonProperty
    private Integer numero;
    @JsonProperty
    private BigDecimal saldo;
    @JsonProperty
    private Correntista correntista;

    public ContaCorrente() {
        this.saldo = BigDecimal.ZERO;
    }

    public ContaCorrente(String banco, String agencia, Integer numero, Correntista correntista) {
        this();
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.correntista = correntista;
    }

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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Boolean identificadoPor(String banco, String agencia, Integer numero){
        return this.banco.equals(banco) && this.agencia.equals(agencia) && this.numero.equals(numero);
    }

    public void executar(Operacao operacao, BigDecimal valor){
        this.saldo = operacao.executar(this.saldo, valor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return Objects.equals(banco, that.banco) && Objects.equals(agencia, that.agencia) && Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(banco, agencia, numero);
    }
}
