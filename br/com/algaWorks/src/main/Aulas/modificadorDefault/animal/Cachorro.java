package br.com.algaWorks.src.main.Aulas.modificadorDefault.animal;

public class Cachorro {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void sentar() {
        System.out.println("Au Au O Cachorro, " + nome + " esta sentado");
    }
}
