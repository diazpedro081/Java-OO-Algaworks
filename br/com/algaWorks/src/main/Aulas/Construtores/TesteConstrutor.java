package br.com.algaWorks.src.main.Aulas.Construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println("nome: [" + pessoa.getNome() + "] idade: [" + pessoa.getIdade() + "] Construtor vazio");
        
        Pessoa primeiraPessoa = new Pessoa("joao", 28);

        System.out.println("nome: [" + primeiraPessoa.getNome() + "] idade: [" + primeiraPessoa.getIdade() + "] Construtor Completo");

        Pessoa segundaPessoa = new Pessoa("jorge");

        System.out.println("nome: [" + segundaPessoa.getNome() + "] idade: [" + segundaPessoa.getIdade() + "] Construtor so nome");

        Pessoa terceiraPessoa = new Pessoa(20);

        System.out.println("nome: [" + terceiraPessoa.getNome() + "] idade: [" + terceiraPessoa.getIdade() + "] Construtor so idade");
        
    }
} 