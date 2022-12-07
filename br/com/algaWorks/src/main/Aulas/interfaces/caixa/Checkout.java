package br.com.algaWorks.src.main.Aulas.interfaces.caixa;

import br.com.algaWorks.src.main.Aulas.interfaces.impressao.Impressora;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Cartao;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Operadora;

public class Checkout {
    
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao) {
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado) {
            this.impressora.imprimir(compra);
        } else {
            System.out.println("Pagamento Recusado!");
        }
    }
    
}
