package br.com.algaWorks.src.main.Aulas.passiarCachorro;

import br.com.algaWorks.src.main.Aulas.carro.Proprietario;
import br.com.algaWorks.src.main.Aulas.petShop.Cachorro;

public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.tutor = new Proprietario();
        pessoa.tutor.setNome("Boby");
		
		pessoa.cachorro = new Cachorro();
		pessoa.cachorro.setNome("show");
		pessoa.cachorro.setIdade(2);
		pessoa.cachorro.setRaça("Beagle");
		pessoa.cachorro.setSexo('F');
		
		caminhada caminhada = new caminhada();
        caminhada.andar(pessoa);
    }
}
