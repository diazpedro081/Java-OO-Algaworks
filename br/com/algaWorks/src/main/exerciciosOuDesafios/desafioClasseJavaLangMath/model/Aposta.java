package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioClasseJavaLangMath.model;


import java.util.Scanner;

import br.com.algaWorks.src.main.exerciciosOuDesafios.desafioClasseJavaLangMath.interfaces.Pessoa;

public class Aposta implements Pessoa{

    private String nomeApostador;
    private int idApostador;
    
    public void geradorDeNumerosMega(){
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            setNomeApostador(entrada.nextLine());
        }
        double[] numeros = new double[6];
        for(int n = 0; n < 6; n++) {
            double aleatorio = Math.random() * 60;
            if(numeros[n] != Math.round(aleatorio) && (Math.round(aleatorio) != 0)) {
                numeros[n] = Math.round(aleatorio);
                System.out.print((int)numeros[n] + " | ");
            }else {
                n--;
            }
        }

        System.out.println("Esses são os seus numeros: " + getNome());
    }

    @Override
    public String getNome() {
        return nomeApostador;
    }
    public String setNomeApostador(String nomeApostador) {
        return this.nomeApostador = nomeApostador;
    }

    @Override
    public int getId() {
        return idApostador;
    }
    public void setIdApostador(int idApostador) {
        this.idApostador = idApostador;
    }

}
