package br.com.algaWorks.src.main.Aulas.math;

public class TesteClasseMath {

    public static void main(String[] args) {

        // Comprimento de uma circunferencia 2 x raio x PI
        int raio = 4;
        double comprimento = 2 * raio * Math.PI;
        System.out.println("Comprimento: " + comprimento);

        // Maior e Menor
        double[] precoPrimeiroProduto = { 30.20, 25.49 };
        System.out.println("O maior é: " +
                Math.max(precoPrimeiroProduto[0], precoPrimeiroProduto[1]) +
                ".\nE o menor é: " +
                Math.min(precoPrimeiroProduto[0], precoPrimeiroProduto[1]) + ".");

        // Potencia
        System.out.println("2ˆ3: " + Math.pow(2, 3));

        // Raiz Quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        // Arredondamneto
        double number = 5.68;
        System.out.println("Maior inteiro: " + Math.ceil(number));
        System.out.println("Menor inteiro: " + Math.floor(number));
        System.out.println("Arredondando resultado para baixo: " + Math.round(number));

        // Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        // Numeros randomicos
        double aleatorio = Math.random() * 999;
        System.out.println("Numero aleatorio: " + Math.round(aleatorio));

    }
}
