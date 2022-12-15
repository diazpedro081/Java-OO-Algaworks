package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FormatadorReal {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.println("Valor do produto:");
		double valor = (600);
		
		BigDecimal valorBig = new BigDecimal(valor);
		BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		String valorFormatado = formatador.format(resultado.doubleValue());
		System.out.println("10% do valor é: " + valorFormatado);
	}

}