package com.alura.alurabank.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Correntista {
    @JsonProperty
    private String nome;
    @JsonProperty
    private String cpf;

    private LocalDate dataDeEntrada = LocalDate.now();

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
