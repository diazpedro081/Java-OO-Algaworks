package br.com.algaWorks.src.main.Aulas.produtos;

public class Preco {

    private double valorCusto;
    private double valorImposto;
    private double valorLucro;
    private double precoVenda;

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(double valorLucro) {
        this.valorLucro = valorLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "\n valorCusto: R$" + valorCusto +
                "\n valorImposto: R$" + valorImposto +
                "\n valorLucro: R$" + valorLucro +
                "\n precoVenda: R$" + precoVenda;
    }

}