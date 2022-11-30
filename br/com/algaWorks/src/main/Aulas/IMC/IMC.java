package br.com.algaWorks.src.main.Aulas.imc;

public class IMC{

    double imc(double peso, double altura) {
        
        double indice = peso / (altura*altura);

        if (indice < 18.5) {
            System.out.println("abaixo do peso");
        } else if (indice < 25) {
            System.out.println("Peso ideal");
        } else {
            System.out.println("Obeso");
        }
        
        return indice;
    }
}