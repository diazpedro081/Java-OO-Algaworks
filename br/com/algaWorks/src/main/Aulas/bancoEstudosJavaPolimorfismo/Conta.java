package br.com.algaWorks.src.main.Aulas.bancoEstudosJavaPolimorfismo;

import br.com.algaWorks.src.main.Aulas.excecoes.SaldoInsuficienteException;

public class Conta {

    protected double saldo;
    protected double limite;
    protected double rendimentos = 90;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double sacar) throws SaldoInsuficienteException {
        if (sacar < 3 || saldo - sacar < 0) {
            throw new SaldoInsuficienteException("You cannot withdraw this amount!");
        } else {
            saldo = saldo - sacar;
            System.out.println("you got it: R$" + sacar + ".\ncurrent balance: U$" + saldo);
        }
    }
    
    public void depositar(double deposito) {
        if (deposito < 3) {
            throw new IllegalArgumentException("Deposits can only be made from U$3.00");
        } else {
            saldo = saldo + deposito;
        }
    }

    public void imprimirSaldo(Conta conta) {
        System.out.println("Account balance: R$" + conta.getSaldo());

        if (conta instanceof ContaCorrente) {
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            System.out.println("The current account limit is U$: " + contaCorrente.getLimite());
        }
        if (conta instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            System.out.println("The income from the savings account is: U$" + contaPoupanca.getRendimentos());
        }
    }

}