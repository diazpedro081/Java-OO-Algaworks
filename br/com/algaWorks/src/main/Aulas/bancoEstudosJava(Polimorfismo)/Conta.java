package br.com.algaWorks.src.main.Aulas.polimorfismo;

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
            throw new SaldoInsuficienteException("Você não pode sacar esse valor!");
        } else {
            saldo = saldo - sacar;
            System.out.println("Você sacou: R$" + sacar + ".\nSaldo atual: R$" + saldo);
        }
    }
    
    public void depositar(double deposito) {
        if (deposito < 3) {
            throw new IllegalArgumentException("Depositos so podem ser feitos a partir de R$3.00");
        } else {
            saldo = saldo + deposito;
        }
    }

    public void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        if (conta instanceof ContaCorrente) {
            ContaCorrente contaCorrente = (ContaCorrente) conta;
            System.out.println("O limite da Conta Corrente é R$: " + contaCorrente.getLimite());
        }
        if (conta instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            System.out.println("Os rendimentos da conta poupanca sao de: R$" + contaPoupanca.getRendimentos());
        }
    }

}