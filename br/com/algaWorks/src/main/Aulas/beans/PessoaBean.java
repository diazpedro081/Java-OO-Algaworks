package br.com.algaWorks.src.main.Aulas.beans;

public class PessoaBean {
    
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return nome + " tem " + idade + " Anos";
    }

    
    
}
