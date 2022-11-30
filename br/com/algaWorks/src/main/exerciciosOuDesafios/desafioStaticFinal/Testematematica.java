package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioStaticFinal;

public class Testematematica {
    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);

        double areaDoCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
        System.out.println("Area do circulo: " + areaDoCirculo);
    }

}
