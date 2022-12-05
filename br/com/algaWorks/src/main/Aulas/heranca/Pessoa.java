package br.com.algaWorks.src.main.Aulas.heranca;

public class Pessoa {

    protected String nome;
    protected int idade;

    public void seApresentar() {
        System.out.println("Ola, eu sou o " + nome + ", e tenho " + idade + " anos");
    }

    @Override
    public String toString() {
        return "O " + nome + ", tem " + idade + " anos";
    }

    
}
