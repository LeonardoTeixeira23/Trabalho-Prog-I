package com.ifrs.edu.restinga.notificadorSpring.notificador;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}