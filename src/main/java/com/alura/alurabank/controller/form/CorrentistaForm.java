package com.alura.alurabank.controller.form;

import com.alura.alurabank.dominio.Correntista;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorrentistaForm {
    @JsonProperty
    private String nome;
    @JsonProperty
    private String cpf;

    public Correntista toCorrentista(){
        Correntista c = new Correntista();
        c.setCpf(this.cpf);
        c.setNome(this.nome);

        return c;
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
