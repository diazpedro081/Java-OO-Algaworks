package br.com.algaWorks.src.main.ExerciciosOuDesafios.ExercicioArrays;

import java.util.Scanner;

public class Verifica {

    void ListarProdutos(int listaProdutos) {
        Scanner entrada = new Scanner(System.in);

        Produtos[] produtos = new Produtos[listaProdutos];

        for (int n = 0; n < produtos.length; n++) {
            if (n != produtos.length) {
                produtos[n] = new Produtos();

                System.out.print("Qual o nome do produto: ");
                String nome = entrada.next();
                produtos[n].setNomeProduto(nome);

                System.out.print("Digite a quantidade do produto " + nome + ": ");
                int quantidade = entrada.nextInt();
                produtos[n].setQuantidadeProduto(quantidade);

                System.out.println(produtos[n]);
                
            } 

        }

        System.out.println("A lista foi Encerrada.");
        
    }
     
}
