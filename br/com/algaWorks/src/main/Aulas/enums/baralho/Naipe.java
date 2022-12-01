package br.com.algaWorks.src.main.Aulas.enums.baralho;

public enum Naipe {
    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelho");

    Naipe(String cor) {
        this.cor = cor;
    }

    private String cor;

    public String getCor() {
        return cor;
    }

}
