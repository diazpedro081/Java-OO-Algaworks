package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioCollections;

import java.math.BigDecimal;

public class Cargo {
    
    private String descricao;
    private BigDecimal salario;

    public Cargo(String descricao, BigDecimal salario) {
        this.descricao = descricao;
        this.salario = salario;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
