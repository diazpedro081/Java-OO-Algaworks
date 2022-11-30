package br.com.algaWorks.src.main.Aulas.encapsulamento;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); // 17 - 25

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.getTemperatura() );

        ar.trocarTemperatura(-21);
        System.out.println("Temperatura do ar: " + ar.getTemperatura() );
    }
}