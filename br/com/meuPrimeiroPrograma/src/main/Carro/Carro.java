package br.com.meuPrimeiroPrograma.src.main.Carro;

public class Carro extends Proprietario {

    private String fabricante;
    private String modelo;
    private String cor;
    private int anoDeFabricacao;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public String toString() {
        return "Proprietario : " + getNome() +
                "\n CPF = " + getCpf() +
                "\nfabricante = " + fabricante +
                "\n modelo = " + modelo +
                "\n cor = " + cor +
                "\n anoDeFabricacao = " + anoDeFabricacao;
    }

    void alarme(boolean onOff) {
        if (onOff == true) {
            System.out.println("Alarme ligado: " + getModelo());
        } else 
            System.out.println("Alarme desligado: " + getModelo());
    }

}