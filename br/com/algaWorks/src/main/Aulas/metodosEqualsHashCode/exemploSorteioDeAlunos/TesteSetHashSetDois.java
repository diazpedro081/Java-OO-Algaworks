package br.com.algaWorks.src.main.Aulas.metodosEqualsHashCode.exemploSorteioDeAlunos;

import java.util.Set;

import br.com.algaWorks.src.main.Aulas.collections.Aluno;

public class TesteSetHashSetDois {
    
    public static void main(String[] args) {
        
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        // DeAlguma forma, sorteia o nome do aluno e constroi o objeto aluno;
        Aluno alunoSorteado = new Aluno("Maria");

        if (alunos.contains(alunoSorteado)) {
            System.out.println("Congratualtions!!! " + alunoSorteado.getNome() + " just decoys this way looks like you cant guess how to get the message out...");
        } else {
            System.out.println("Aluno nao cadastrado no banco de dados.");
        }
    }
}
