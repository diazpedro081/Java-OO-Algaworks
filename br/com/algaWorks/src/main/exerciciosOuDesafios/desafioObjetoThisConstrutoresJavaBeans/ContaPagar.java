package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioObjetoThisConstrutoresJavaBeans;

public class ContaPagar{

    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    public ContaPagar() {}

    public ContaPagar(Fornecedor fornecedor ,String descricao, Double valor, String dataVencimento) {
        
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de " 
			+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
			+ " do fornecedor " + this.getFornecedor().getNome() + ".");
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Override
    public String toString() {
        return "Conta a Pagar: \n " +
        "\n Fornecedor: " + fornecedor +
        "\n Descricao: " + descricao +
        "\n Valor: R$" + valor + 
        "\n Data de Vencimento: " + dataVencimento;
    }

}