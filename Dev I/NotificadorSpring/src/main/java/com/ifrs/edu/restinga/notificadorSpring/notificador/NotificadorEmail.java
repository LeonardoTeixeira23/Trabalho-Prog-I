package com.ifrs.edu.restinga.notificadorSpring.notificador;

import org.springframework.stereotype.Component;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;

@Component
public class NotificadorEmail {
		
		public NotificadorEmail() {
			System.out.println("Construtor Chamado!");
		}
		
		public void notificar(Cliente cliente, String mensagem) {
			System.out.printf("Notificando %s através do e-mail %s: %s\n", 
					cliente.getNome(), cliente.getEmail(), mensagem);
		}
		
}

