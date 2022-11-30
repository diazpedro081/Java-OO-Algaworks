package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioObjetoThisConstrutoresJavaBeans;

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
