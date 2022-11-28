package br.com.algaWorks.src.main.Aulas.PassiarCachorro;

public class caminhada {
    public void andar(Pessoa pessoa) {
        System.out.println(pessoa.tutor.getNome() +
                " esta andando com o " + pessoa.cachorro.getNome());
    }
}
