package br.com.algaWorks.src.main.Aulas.StringsJava;

public class TesteStrings {
    
    public static void main(String[] args) {
        // String, StringBuilder e StringBuffer

        String s = "Ola,";
        s += " Pessoal!";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Ola");
        sb.append(" Pessoal");

        String resultado = sb.toString();

        System.out.println("Com String Builder: " + resultado);
    }
}
