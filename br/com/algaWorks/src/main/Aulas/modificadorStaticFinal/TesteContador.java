package br.com.algaWorks.src.main.Aulas.modificadorStaticFinal;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
    //  System.out.println(Contador.COUNT);

        Contador.COUNT++;
    //  System.out.println(contador.COUNT);

       Contador.imprimirContador();
    }

}
