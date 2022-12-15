package br.com.algaWorks.src.main.Aulas.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
    
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 1300.59;

        System.out.println(valorProduto);
        System.out.println(formatador.format(valorProduto));

        String entrada = "R$ 50,34";
        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Numero: " + numero);
        } catch (ParseException e) {
            System.out.println("Entrada Invalida.");
        }

        BigDecimal bigDecimal= new BigDecimal(5000);
        System.out.println(bigDecimal);
    }
}
