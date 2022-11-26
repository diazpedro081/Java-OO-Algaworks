package br.com.algaWorks.src.main.Carro;

public class TesteArrayComCarro {
    public static void main(String[] args) {
        Carro[] carros = new Carro[2];

        carros[0] = new Carro();

        carros[0].setFabricante("Ferrari");
        carros[0].setModelo("458 Italia");
        carros[0].setCor("vermelho");
        carros[0].setAnoDeFabricacao(2014);
        carros[0].setNome("Stev");

        carros[1] = new Carro();
        
        carros[1].setFabricante("Ford");
        carros[1].setModelo("fusion");
        carros[1].setCor("branco");
        carros[1].setAnoDeFabricacao(2018);
        carros[1].setNome("George");

        System.out.println(carros[1]);

        for(int i = 0; i < carros.length; i++) {
            System.out.println("posicao[" + i + "] = " + carros[i]);
        }

    }
}
