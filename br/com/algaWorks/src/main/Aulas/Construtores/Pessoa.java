package br.com.algaWorks.src.main.Aulas.construtores;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

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
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return nome + ", tem " + idade + " anos";
    }

    
}
