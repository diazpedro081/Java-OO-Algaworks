package br.com.algaWorks.src.main.Aulas.ordenandoObjetos;

import java.util.Comparator;

import br.com.algaWorks.src.main.Aulas.construtores.Pessoa;

public class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() < p2.getIdade()) {
            return -1;
        } else if (p1.getIdade() > p2.getIdade()) {
            return 1;
        }
        return 0;
    }
    
}
