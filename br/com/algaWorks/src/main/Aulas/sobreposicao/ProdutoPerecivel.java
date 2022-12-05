package br.com.algaWorks.src.main.Aulas.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    
    protected Date dataValidade;

    @Override
    public void identificar() {
        System.out.println("Minha data de validade é: " + dataValidade);
        super.identificar();
    }

}
