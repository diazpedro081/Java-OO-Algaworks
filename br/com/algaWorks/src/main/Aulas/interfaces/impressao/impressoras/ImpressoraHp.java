package br.com.algaWorks.src.main.Aulas.interfaces.impressao.impressoras;

import br.com.algaWorks.src.main.Aulas.interfaces.impressao.Impressora;
import br.com.algaWorks.src.main.Aulas.interfaces.impressao.Imprimivel;

public class ImpressoraHp implements Impressora{

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println(" * * * * * * * * * * * * * * * * * *");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println(" * * * * * * * * * * * * * * * * * *");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println(" ");
        System.out.println(" * * * * * * * * * * * * * * * * * *");
        System.out.println("==               HP               ==");
        System.out.println(" * * * * * * * * * * * * * * * * * *");
    }

}
