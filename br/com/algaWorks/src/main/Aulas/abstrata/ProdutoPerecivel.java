package br.com.algaWorks.src.main.Aulas.abstrata;

public class ProdutoPerecivel extends Produto{

    @Override
    public void descricaoProduto(String nomeProduto, String validadeProduto) {
        System.out.println("A validade do produto, " + nomeProduto + ", vence em " + validadeProduto + ".");
    }
    
}
