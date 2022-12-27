package br.com.algaWorks.src.main.Aulas.stringBuilderStringBuffer;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder(); // não=thread-safe - mais rapido
        builder.append("Bem vindo ao curso de java. \n");
        builder.append("Fique a vontade para tirar suas duvidas. ");
        builder.append("Estamos aqui para te ajudar. \n");

        System.out.print(builder.toString());

        builder.insert(26, " da AlgaWorks");

        System.out.println(builder);
    }
}
