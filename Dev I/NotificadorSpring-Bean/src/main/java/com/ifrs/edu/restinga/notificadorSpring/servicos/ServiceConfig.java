package com.ifrs.edu.restinga.notificadorSpring.servicos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ifrs.edu.restinga.notificadorSpring.notificador.Notificador;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}