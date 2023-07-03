package com.alura.alurabank.controller;

import com.alura.alurabank.dominio.Investimento;
import com.alura.alurabank.dominio.enun.TipoInvestimento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {



    @PutMapping
    public ResponseEntity aplicaInvestimento(@RequestBody Investimento investimento){
        try {
            TipoInvestimento tipoEscolhido = TipoInvestimento.valueOf(investimento.getTpInvestimento());
            BigDecimal valorAdquirido = tipoEscolhido.render(investimento.getSaldo());
            return ResponseEntity.ok(valorAdquirido);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Tipo de Investimento Inexistente");
        }

    }


}
