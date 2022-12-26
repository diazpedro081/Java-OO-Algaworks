package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioPacotesEnumeracoes.financeiro.modelo;

public class ContaPagar {

    private SituacaoConta situacaoConta;

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public ContaPagar(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public void pagar() {
        getSituacaoConta();
        getSituacaoConta();
        if (this.situacaoConta.equals(SituacaoConta.PAGA) || situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("Uma conta só deve ser paga se a situação atual for pendente");
        } else {
            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println("A conta foi paga");
        }
    }

    public void cancelar() {
        getSituacaoConta();
        getSituacaoConta();
        if (this.situacaoConta.equals(SituacaoConta.PAGA) || situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("nao se pode cancelar uma conta que ja esta Cancelada/Paga");
        } else {
            getSituacaoConta();
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("A conta foi cancelada");
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
