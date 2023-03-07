package com.di;

import com.di.modelo.Cliente;
import com.di.notificacao.Notificador;
import com.di.notificacao.NotificadorSms;
import com.di.service.AtivacaoClienteService;

public class Principal {
public static void main(String[] args) {
    Cliente joao = new Cliente("João", "joao@321.com", "44444444");
    Cliente maria = new Cliente("Maria", "maria@321.com", "33333333");

    Notificador notificar = new NotificadorSms();

    AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificar);
    ativacaoCliente.ativar(joao);
    ativacaoCliente.ativar(maria);
}
}
