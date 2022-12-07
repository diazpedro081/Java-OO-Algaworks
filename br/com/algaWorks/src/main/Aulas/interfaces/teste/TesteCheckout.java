package br.com.algaWorks.src.main.Aulas.interfaces.teste;

import br.com.algaWorks.src.main.Aulas.interfaces.caixa.Checkout;
import br.com.algaWorks.src.main.Aulas.interfaces.caixa.Compra;
import br.com.algaWorks.src.main.Aulas.interfaces.impressao.Impressora;
import br.com.algaWorks.src.main.Aulas.interfaces.impressao.impressoras.ImpressoraHp;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Cartao;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Operadora;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.operadoras.Cielo;

public class TesteCheckout {
    
    public static void main(String[] args) {
        Operadora operador = new Cielo();
        Impressora impressora = new ImpressoraHp();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Gouves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.5);

        Checkout checkout = new Checkout(operador, impressora);
        checkout.fecharCompra(compra, cartao);
        
    }
}
