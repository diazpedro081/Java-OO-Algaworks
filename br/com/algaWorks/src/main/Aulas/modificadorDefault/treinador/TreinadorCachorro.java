package br.com.algaWorks.src.main.Aulas.modificadorDefault.treinador;

import br.com.algaWorks.src.main.Aulas.modificadorDefault.animal.Cachorro;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");

        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);
    }
}
