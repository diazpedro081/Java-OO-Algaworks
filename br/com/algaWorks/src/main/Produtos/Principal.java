package br.com.algaWorks.src.main.Produtos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Preco preco = new Preco();
        System.out.print("Qual o preço do produto: ");
        preco.setValorCusto(entrada.nextDouble());

        Produto produto = new Produto();
        produto.definirPreco(preco, 20, 15);

        System.out.println(preco);
        
    }
    
}