package br.com.algaWorks.src.main.Aulas.Carro;

public class Proprietario {
    
    private String nome;
    private String cpf;
    private int idade;
    private String logradouro;
    private String bairro;
    private String cidade;



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
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return ": \n nome=" + nome + 
        "\n cpf = " + cpf + 
        "\n idade = " + idade + 
        "\n logradouro = " + logradouro + 
        "\n bairro = " + bairro + 
        "\n cidade = " + cidade;
    }
    
}