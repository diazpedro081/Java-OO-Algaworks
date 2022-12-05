package br.com.algaWorks.src.main.exerciciosOuDesafios.desafioWrappersBoxing;

class Televisor {
    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) {
            System.out.println("New channel is also current channel.");
        } else {
            canal = novoCanal;
            System.out.println("Channel changed to: " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            System.out.println("New volume is also current volume.");
        } else {
            volume = novoVolume;
            System.out.println("Volume changed to: " + volume);
        }
    }

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.mudarVolume(20);
        tv.mudarCanal(130);

        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }
}
