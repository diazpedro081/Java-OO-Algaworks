package com.di.notificacao;

import com.di.modelo.Cliente;

public class NotificadorSms implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando o cliente %s atraves do telefone: %s \n %s \n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
