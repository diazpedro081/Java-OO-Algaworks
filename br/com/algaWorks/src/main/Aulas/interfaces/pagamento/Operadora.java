package br.com.algaWorks.src.main.Aulas.interfaces.pagamento;

public interface Operadora {
    
    boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
