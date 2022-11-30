package br.com.algaWorks.src.main.Aulas.pagamentos;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {

        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }

    @Override
    public String toString() {
        return "FolhaPagamento []";
    }
    
}
