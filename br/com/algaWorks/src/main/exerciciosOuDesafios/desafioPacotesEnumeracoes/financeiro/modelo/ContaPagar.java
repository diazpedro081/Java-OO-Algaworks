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
        if (this.situacaoConta.equals(getSituacaoConta().PAGA) || situacaoConta.equals(getSituacaoConta().CANCELADA)) {
            System.out.println("Uma conta só deve ser paga se a situação atual for pendente");
        } else {
            this.situacaoConta = situacaoConta.PAGA;
            System.out.println("A conta foi paga");
        }
    }

    public void cancelar() {
        if (this.situacaoConta.equals(getSituacaoConta().PAGA) || situacaoConta.equals(getSituacaoConta().CANCELADA)) {
            System.out.println("nao se pode cancelar uma conta que ja esta Cancelada/Paga");
        } else {
            this.situacaoConta = getSituacaoConta().CANCELADA;
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
