package br.com.algaWorks.src.main.Aulas.interfaces.caixa;

import br.com.algaWorks.src.main.Aulas.interfaces.impressao.Imprimivel;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

    private double valorTotal;
    private String produto;
    private String nomeCliente;

    @Override
    public String getCabecalhoPagina() {
        
        return this.getProduto() + " = " + this.getValorTotal();
    }
    @Override
    public String getCorpoPagina() {
        return this.getNomeCliente();
    }

    @Override
    public double getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
}
