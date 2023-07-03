package com.alura.alurabank.repository;

import com.alura.alurabank.dominio.ContaCorrente;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class RepoContaCorrente {

    private Set<ContaCorrente> contas;

    public RepoContaCorrente() {
        this.contas = new HashSet<>();
    }

    public void save(ContaCorrente conta) {
        contas.add(conta);
    }
    public void remove(ContaCorrente conta){
        contas.remove(conta);
    }
    public Optional<ContaCorrente> consultaConta(String banco, String agencia, Integer numero){
        return contas.stream().filter(contaCorrente -> contaCorrente.identificadoPor(banco, agencia, numero)).findFirst();
    }
}
