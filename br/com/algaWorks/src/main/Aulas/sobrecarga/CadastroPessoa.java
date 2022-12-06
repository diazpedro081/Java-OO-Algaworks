package br.com.algaWorks.src.main.Aulas.sobrecarga;

public class CadastroPessoa {
    
    public void cadastrar(Pessoa pessoa) {
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    public void cadastrar(String nome, int idade) {
        armazenar(nome, idade);
    }

    private void armazenar(String nome, int idade) {
        // SAlva em banco de dados
        System.out.println("salvando: " + nome + ", co " + idade + " anos.");
    }
}