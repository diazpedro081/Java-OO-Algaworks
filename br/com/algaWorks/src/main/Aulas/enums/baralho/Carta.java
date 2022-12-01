package br.com.algaWorks.src.main.Aulas.enums.baralho;

public class Carta {
    
    private int numero;
    private Naipe naipe;
    
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return " A Carta de numero: " + numero + ", tem o naipe: " + naipe + ", e a cor: " + naipe.getCor();
    }

    
}
