package com.ifrs.edu.restinga.notificadorSpring.servicos;

import org.springframework.stereotype.Component;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;
import com.ifrs.edu.restinga.notificadorSpring.notificador.NotificadorEmail;


@Component
public class AtivacaoClienteService {
	private NotificadorEmail notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("Ativando: " + notificador);
	}
	
			
	public void ativar(Cliente cliente) {
			cliente.ativar();
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
