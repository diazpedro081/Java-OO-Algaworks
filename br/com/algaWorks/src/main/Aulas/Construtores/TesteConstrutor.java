package br.com.algaWorks.src.main.Aulas.Construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println("nome: [" + pessoa.getNome() + "] idade: [" + pessoa.getNome() + "]");

        pessoa.setNome("Jorge");
        pessoa.setIdade(28);

        System.out.println("nome: [" + pessoa.getNome() + "] idade: [" + pessoa.getNome() + "]");
    }
}