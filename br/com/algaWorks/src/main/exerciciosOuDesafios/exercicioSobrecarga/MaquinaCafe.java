package br.com.algaWorks.src.main.exerciciosOuDesafios.exercicioSobrecarga;

public class MaquinaCafe {
    
    int acucarDisponivel;

    void fazerCafe() {
        if (acucarDisponivel < 10) {
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= 10;
            System.out.println("Fazendo cafezinho com 10 gramas de açucar.");
        }
    }

    void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar) {
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }

    
}
