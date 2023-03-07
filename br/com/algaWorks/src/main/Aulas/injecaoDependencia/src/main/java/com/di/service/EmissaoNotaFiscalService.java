package com.di.service;

import com.di.modelo.Cliente;
import com.di.modelo.Produto;
import com.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO Emite nota fiscal

        notificador.notificar(cliente, "Nota fiscal do produto: "  + produto.getNome() + " foi emitita!");
    }
}
