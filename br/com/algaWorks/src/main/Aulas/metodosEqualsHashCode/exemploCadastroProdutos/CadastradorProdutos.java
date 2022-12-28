package br.com.algaWorks.src.main.Aulas.metodosEqualsHashCode.exemploCadastroProdutos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class CadastradorProdutos {
    public static void main(String[] args) {
        Collection<Produto> produtos = new HashSet<>();

        System.out.println("### Cadastro produtos ###\n");

        /*
         * try-with-resources, que ao final do try irá chamar o método close() do Scanner.
         */
        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equals(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                /*
                 * ira informar se o produto inserido ja existe na coleção.
                 */
                Produto produto = new Produto(sku, nome);
                /*
                 * Regra de Exemplo simples normalmenter seria utilizado uma exceção.
                 */
                if (produtos.contains(produto)) {
                    System.err.println("Esse produto ja foi adicionado. Utilize outro SKU!");
                    System.err.flush();
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado");
                }
                System.out.println("\nDeseja adicionar mais algum produto? (s/n)");
                continuar = entrada.nextLine();
            }
        }

        /*
         * Cada um dos elementos é entregue ao método println() de System.out, esse recurso é chamado de method reference.
         */
        produtos.forEach(System.out::println);

        System.out.println("FIM!");
    }
}
