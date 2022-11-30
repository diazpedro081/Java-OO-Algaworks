package br.com.algaWorks.src.main.Aulas.produtos;

public class Produto {

    void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
        // add 20% ao preco de custo
        preco.setValorImposto(
            preco.getValorCusto() * percentualImpostos / 100);

        preco.setValorLucro(
            preco.getValorCusto() * margemLucro / 100);

        preco.setPrecoVenda(
            preco.getValorCusto() + preco.getValorImposto() + preco.getValorLucro());
    }
}
