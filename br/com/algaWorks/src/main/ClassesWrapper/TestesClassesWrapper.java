package br.com.algaWorks.src.main.ClassesWrapper;

public class TestesClassesWrapper {
    public static void main(String[] args) {
        // byte, short int, long, float, double e char
        // Byte, Short, Integer, Long, Float, Double e Character

        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();
        // xxxValue();

        String valor = "15.5";
        Float v = new Float(valor);
        System.out.println(v + 3);

        int idade = Integer.parseInt("27"); // parseXXX
        System.out.println("Daqui a 5 anos você tera: " + ( idade + 5) + " anos.");

        double custo = Double.parseDouble("23.5");
        System.out.println("Custo total: " + custo);

        try {
            double custoTryCatch = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
            System.out.println("Custo total: " + custoTryCatch);
        } catch (NumberFormatException e) {
            System.err.println("Numero invalido para conversão.");
        }
    }

}
