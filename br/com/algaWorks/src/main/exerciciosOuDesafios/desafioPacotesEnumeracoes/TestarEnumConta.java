package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes;

import br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes.financeiro.modelo.ContaPagar;
import br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes.financeiro.modelo.Fornecedor;
import br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes.financeiro.modelo.SituacaoConta;

public class TestarEnumConta {
    public static void main(String[] args) {
        
            Fornecedor imobiliaria = new Fornecedor();
            imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
    
            Fornecedor mercado = new Fornecedor();
            mercado.setNome("Mercado do João");
            
            ContaPagar conta1 = new ContaPagar(SituacaoConta.PAGA);
            // conta1.setDescricao("Aluguel da matriz");
            // conta1.setValor(1230d);
            // conta1.setDataVencimento("10/05/2012");
            // conta1.setFornecedor(imobiliaria);
            
            // ContaPagar conta2 = new ContaPagar();
            
            // ContaPagar conta3 = new ContaPagar();
            
            // pagamento de conta pendente (ok, deve funcionar)
            conta1.pagar();
            
            // tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
            // conta2.cancelar();
            // conta2.pagar();
            
            // tentativa de pagar uma conta duas vezes (não deve aceitar na segunda vez)
            // conta3.pagar();
            // conta3.pagar();
        }
    }