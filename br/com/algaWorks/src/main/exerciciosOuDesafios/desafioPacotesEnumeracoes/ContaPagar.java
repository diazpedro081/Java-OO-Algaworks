package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes;

public class ContaPagar {

    private SituacaoConta situacaoConta;

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    void pagar() {
        if (situacaoConta.equals(getSituacaoConta())) {
            System.out.println("Uma conta só deve ser paga se a situação atual for pendente");
        } else {
            this.situacaoConta = situacaoConta.PAGA;
            System.out.println("Conta disponivel para pagamento");
        }
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    @Override
    public String toString() {
        return "Conta a Pagar \nSituacao Conta: " + situacaoConta;
    }

}
