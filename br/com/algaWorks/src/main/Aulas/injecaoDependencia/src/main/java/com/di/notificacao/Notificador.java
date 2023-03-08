package com.di.notificacao;

import com.di.modelo.Cliente;

public interface Notificador {
 void notificar(Cliente cliente, String mensagem);
}
