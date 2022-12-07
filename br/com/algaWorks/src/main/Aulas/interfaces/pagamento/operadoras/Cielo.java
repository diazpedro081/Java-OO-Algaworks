package br.com.algaWorks.src.main.Aulas.interfaces.pagamento.operadoras;

import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Autorizavel;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Cartao;
import br.com.algaWorks.src.main.Aulas.interfaces.pagamento.Operadora;

public class Cielo implements Operadora{

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        
        return cartao.getNumeroCartao().startsWith("123")
            && autorizavel.getValorTotal() < 100;
    }

}
