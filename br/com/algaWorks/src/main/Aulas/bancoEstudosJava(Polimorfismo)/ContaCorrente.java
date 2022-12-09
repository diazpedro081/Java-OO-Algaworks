package br.com.algaWorks.src.main.Aulas.polimorfismo;

public class ContaCorrente extends Conta {
    
    

    public double getLimite() {
        return limite;
    }
    
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo da Conta Corrente: R$" + saldo;
    }

}
