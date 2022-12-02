package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes.financeiro.modelo;

public class Fornecedor {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
