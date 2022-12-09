package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPolimorfismoClassesAbstratas;

public abstract class Conta {

    private String Descricao;
    private Double Valor;
    private String DataVencimento;
    private Fornecedor fornecedor;
    private Cliente cliente;

    public abstract void exibirDetalhes();

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Double getValor() {
        return Valor;
    }
    public void setValor(Double valor) {
        Valor = valor;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
