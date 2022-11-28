package br.com.algaWorks.src.main.Aulas.PassiarCachorro;

import br.com.algaWorks.src.main.Aulas.Carro.Proprietario;
import br.com.algaWorks.src.main.Aulas.PetShop.Cachorro;

public class Pessoa{

    Proprietario tutor;
    Cachorro cachorro;
    @Override
    public String toString() {
        return "Pessoa tutor: " + tutor + "\n cachorro:" + cachorro;
    }

    
    
}
