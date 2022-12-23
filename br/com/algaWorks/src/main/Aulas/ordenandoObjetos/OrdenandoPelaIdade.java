package br.com.algaWorks.src.main.Aulas.ordenandoObjetos;

import java.util.Arrays;
import java.util.List;

import br.com.algaWorks.src.main.Aulas.construtores.Pessoa;

public class OrdenandoPelaIdade {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 22);
        Pessoa p2 = new Pessoa("Adriano", 23);
        Pessoa p3 = new Pessoa("Bruno", 21);

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();
        pessoas.sort(idadeComparator);

        pessoas.forEach(System.out::println);
    }
}
