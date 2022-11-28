package br.com.algaWorks.src.main.Aulas.Carro;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Pedro");
        proprietario.setCpf("95448254373");

        carro.setNome(proprietario.getNome());
        carro.setCpf(proprietario.getCpf());
        carro.setFabricante("Fiat");
        carro.setModelo("Palio");
        carro.setCor("Preto");
        carro.setAnoDeFabricacao(2008);

        carro.alarme(false);

        Carro carroDois = new Carro();

        carroDois.setNome(proprietario.getNome());
        carroDois.setCpf(proprietario.getCpf());
        carroDois.setFabricante("Honda");
        carroDois.setModelo("Civic");

        carroDois.alarme(true);

        System.out.println(carro);
        System.out.println("//////////////");
        System.out.println(carroDois);
    }
}