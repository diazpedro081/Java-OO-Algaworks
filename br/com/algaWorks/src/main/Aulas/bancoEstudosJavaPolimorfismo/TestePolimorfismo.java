package br.com.algaWorks.src.main.Aulas.bancoEstudosJavaPolimorfismo;

public class TestePolimorfismo {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        conta.imprimirSaldo(conta);
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        conta.imprimirSaldo(contaCorrente);
        
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(300);
        conta.imprimirSaldo(contaPoupanca);

    }

}