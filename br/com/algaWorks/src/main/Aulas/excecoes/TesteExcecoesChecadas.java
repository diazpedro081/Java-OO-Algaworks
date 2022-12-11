package br.com.algaWorks.src.main.Aulas.excecoes;

import br.com.algaWorks.src.main.Aulas.bancoEstudosJavaPolimorfismo.ContaCorrente;

public class TesteExcecoesChecadas {
    
    public static void main(String[] args) {
        ContaCorrente novaContaCorrente = new ContaCorrente(100);
        try {
            novaContaCorrente.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }

    }
    
}
