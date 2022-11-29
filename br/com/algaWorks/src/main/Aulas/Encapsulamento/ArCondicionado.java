package br.com.algaWorks.src.main.Aulas.Encapsulamento;

public class ArCondicionado {
    
    private int temperatura;

    void trocarTemperatura(int temperatura) {
        if (temperatura >= 17 && temperatura <= 25) {
            this.temperatura = temperatura;
        } else {
            System.out.println("O Ar não suporta a temperatura informada");
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

}
