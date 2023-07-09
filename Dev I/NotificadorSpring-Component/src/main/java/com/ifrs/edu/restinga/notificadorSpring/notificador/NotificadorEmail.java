package com.ifrs.edu.restinga.notificadorSpring.notificador;

import org.springframework.stereotype.Component;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}


}
