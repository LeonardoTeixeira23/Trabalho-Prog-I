package com.ifrs.edu.restinga.notificadorSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;
import com.ifrs.edu.restinga.notificadorSpring.servicos.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
		
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
	Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		ativacaoClienteService.ativar(joao);
		return "Hello!";
	}
		
}
