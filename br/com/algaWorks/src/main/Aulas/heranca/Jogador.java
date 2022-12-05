package br.com.algaWorks.src.main.Aulas.heranca;

public class Jogador extends Pessoa {

    public void dizerSeAindaJoga(boolean aindaJoga) { 
        if (aindaJoga == true) {
            System.out.println("Eu ainda jogo");
        } else if(aindaJoga == false) {
            System.out.println("Não jogo");
        }
    }

}
