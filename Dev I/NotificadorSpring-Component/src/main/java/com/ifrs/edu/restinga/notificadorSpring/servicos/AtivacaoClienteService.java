package com.ifrs.edu.restinga.notificadorSpring.servicos;

import org.springframework.stereotype.Component;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;
import com.ifrs.edu.restinga.notificadorSpring.notificador.Notificador;

@Component
public class AtivacaoClienteService {
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("Ativando: " + notificador);
	}
	
			
	public void ativar(Cliente cliente) {
			cliente.ativar();
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
