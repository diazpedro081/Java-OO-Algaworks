package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioCollections;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        Governo governo = new Governo();

        Cargo vereador = new Cargo("Vereador", new BigDecimal(16000));
        Cargo deputadoEstadual = new Cargo("Deputado Estadual", new BigDecimal(25000));
        Cargo prefeito = new Cargo("Prefeito", new BigDecimal(27000));

        Politico politico = new Politico("jão das couves", prefeito);
        governo.adicionarPolitico("RBLH", politico);

        politico = new Politico("Manuel", vereador);
        governo.adicionarPolitico("PCOR", politico);

        politico = new Politico("Maria Carvalho", vereador);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico("Josefa Silva", deputadoEstadual);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico("Sebastião Mendes", prefeito);
        governo.adicionarPolitico("PCOR", politico);

        BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
        System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));

        BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
        System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

        BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
        System.out.println("Gastos com vereadores do partido LDRS: "
                + formatador.format(gastosVereadoresLdrs.doubleValue()));

        BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
        System.out.println("Gastos com deputados estaduais do partido LDRS: "
                + formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));

        BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
        System.out.println("Gastos com prefeitos do partido LDRS: "
                + formatador.format(gastosPrefeitosLdrs.doubleValue()));

    }
}
