package br.com.algaWorks.src.main.Aulas.polimorfismo;

public class Conta {
    
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        if(conta instanceof ContaCorrente) {
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            System.out.println("O limite da Conta Corrente é R$: " + contaCorrente.getLimite());
        } 
        if(conta instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            System.out.println("Os rendimentos da conta poupanca sao de: R$" + contaPoupanca.getRendimentos());
        }
    }
}
