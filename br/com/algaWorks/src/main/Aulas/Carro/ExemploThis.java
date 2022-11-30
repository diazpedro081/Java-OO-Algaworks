package br.com.algaWorks.src.main.Aulas.carro;

public class ExemploThis {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Palio");

        System.out.println("Modelo antes " + carro.getModelo());

        carro.alterarModelo("civic");

        System.out.println("Modelo depois " + carro.getModelo());
    }
}
