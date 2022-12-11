package br.com.algaWorks.src.main.Aulas.excecoes;

import br.com.algaWorks.src.main.Aulas.bancoEstudosJavaPolimorfismo.ContaCorrente;

public class TesteExcecoes {
    
    public static void main(String[] args) {
        /*
         * int numero = 5 / 0; // java.lang.ArithmeticException
         * String s = null;
         * String maiuscula = s.toUpperCase(); // lança java.lang.NullPointerException
         */

         ContaCorrente contaCorrente = new ContaCorrente(100);

         try {
             contaCorrente.depositar(1); //depositar
         } catch (IllegalArgumentException e) {
            System.err.println("VocÊ executou uma operação ilegal: " + e.getMessage());
         }

         System.out.println(contaCorrente);
    }
}