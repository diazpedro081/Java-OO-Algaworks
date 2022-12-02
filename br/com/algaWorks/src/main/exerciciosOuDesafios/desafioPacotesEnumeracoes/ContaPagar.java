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
