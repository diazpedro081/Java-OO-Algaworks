package br.com.algaWorks.src.main.Aulas.imc;

public class Paciente extends IMC {

    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente \n nome: " + nome +
                "\n CPF: " + cpf +
                "\n Idade: " + idade;
    }
}