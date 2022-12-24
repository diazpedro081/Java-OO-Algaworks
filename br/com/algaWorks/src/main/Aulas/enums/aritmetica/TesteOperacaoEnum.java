package br.com.algaWorks.src.main.Aulas.enums.aritmetica;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        
        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;

        int resultAdicao = o1.operacao(5, 3);
        System.out.println("O resultado é: " + resultAdicao);

        for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
            System.out.println(oa + " -> " + oa.operacao(4, 2));
        }
    }
}
