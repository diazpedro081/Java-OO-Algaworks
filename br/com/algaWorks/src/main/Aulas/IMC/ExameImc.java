package br.com.algaWorks.src.main.Aulas.IMC;

import java.util.Scanner;

public class ExameImc {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o nome do paciente: ");
        paciente.setNome(entrada.nextLine());

        System.out.print("Qual o CPF do paciente: ");
        paciente.setCpf(entrada.nextLine());

        System.out.print("Qual a idade do paciente: ");
        paciente.setIdade(entrada.nextInt());
        

        System.out.print("Qual o peso do paciente: ");
        double pesoPaciente = entrada.nextDouble();

        System.out.print("Qual a altura do paciente: ");
        double alturaPaciente = entrada.nextDouble();

        System.out.printf("O " + paciente + " esta com o IMC " + paciente.imc(pesoPaciente, alturaPaciente));
    }
}