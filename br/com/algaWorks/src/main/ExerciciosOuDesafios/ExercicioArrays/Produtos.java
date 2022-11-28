
// Uma pequena empresa atacadista com sede na cidade de Uberlândia precisa conferir seu estoque de produtos, para isso, surgiu a ideia de desenvolver um programa para os estoquistas digitarem os nomes dos produtos e as quantidades.

// Ao final da contagem, o programa deve mostrar na tela uma lista com todos os produtos digitados, assim os usuários podem enviar o resultado para uma impressora ou gravar em algum arquivo, como quiserem.

// Você, programador que está ficando bem conhecido no país pelas habilidades em Java, foi chamado para desenvolver esse software.

package br.com.algaWorks.src.main.ExerciciosOuDesafios.ExercicioArrays;

public class Produtos {

    private String nomeProduto;
    private int quantidadeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "O Produto: " + nomeProduto + ", possui: " + quantidadeProduto + " unidades.";
    }

}
