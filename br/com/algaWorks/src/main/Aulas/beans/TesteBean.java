package br.com.algaWorks.src.main.Aulas.beans;

public class TesteBean {
    public static void main(String[] args) {
        PessoaBean[] pessoa = new PessoaBean[6];

        pessoa[0] = new PessoaBean();

        pessoa[0].setNome("Maria");
        pessoa[0].setIdade(27);

        System.out.println(pessoa[0]);
    }
}
