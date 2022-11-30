package br.com.algaWorks.src.main.exerciciosOuDesafios.exercicioArrays;

import java.util.Scanner;

public class Conferir {
    public static void main(String[] args) {

        Verifica verifica = new Verifica();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o tamanho da lista de produtos: ");
        int listaProdutos = entrada.nextInt();

        verifica.ListarProdutos(listaProdutos);

    }
}
