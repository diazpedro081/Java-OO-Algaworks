package br.com.algaWorks.src.main.Aulas.boxing;

public class Principal {
    
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        // ERRADO
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

        // CORRETO
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));

    }
}
