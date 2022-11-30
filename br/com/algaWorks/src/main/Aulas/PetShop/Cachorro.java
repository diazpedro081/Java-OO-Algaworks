package br.com.algaWorks.src.main.Aulas.petShop;

public class Cachorro {

    private String nome;
    private String raça;
    private char sexo;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    @Override
    public String toString() {
        return "Cachorro: \n nome: " + nome +
                "\n raça: " + raça +
                "\n sexo: " + sexo +
                "\n idade: " + idade;
    }

}
