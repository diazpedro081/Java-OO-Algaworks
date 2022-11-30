package br.com.algaWorks.src.main.Aulas.passiarCachorro;

import br.com.algaWorks.src.main.Aulas.carro.Proprietario;
import br.com.algaWorks.src.main.Aulas.petShop.Cachorro;

public class Pessoa{

    Proprietario tutor;
    Cachorro cachorro;
    @Override
    public String toString() {
        return "Pessoa tutor: " + tutor + "\n cachorro:" + cachorro;
    }

    
    
}
