package br.com.algaWorks.src.main.Aulas.metodosEqualsHashCode.exemploSorteioDeAlunos;

import java.util.HashSet;
import java.util.Set;

import br.com.algaWorks.src.main.Aulas.collections.Aluno;

public class SimuladorBancoDeDados {
    
    public static Set<Aluno> buscarAlunos() {
        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(new Aluno("Ricardo"));
        alunos.add(new Aluno("Thiago"));
        alunos.add(new Aluno("Maria"));

        return alunos;
    }
}
