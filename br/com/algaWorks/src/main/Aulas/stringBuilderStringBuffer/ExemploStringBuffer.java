package br.com.algaWorks.src.main.Aulas.stringBuilderStringBuffer;

public class ExemploStringBuffer {
    public static void main(String[] args) {
        // thread-safe - use no contexto de concorrencia
        StringBuffer buffer = new StringBuffer();

        buffer.append("Bem vindo ao curso de java. \n");
        buffer.append("Fique a vontade para tirar suas duvidas. ");
        buffer.append("Estamos aqui para te ajudar. \n");

        System.out.print(buffer.toString());

        buffer.insert(26, " da AlgaWorks");

        System.out.println(buffer);
    }
}
