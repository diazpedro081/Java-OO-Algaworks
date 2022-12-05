package br.com.algaWorks.src.main.Aulas.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.descricao = "caixa de fosforo";
        produtoPerecivel.dataValidade = new Date();
        produtoPerecivel.identificar();
    }

}