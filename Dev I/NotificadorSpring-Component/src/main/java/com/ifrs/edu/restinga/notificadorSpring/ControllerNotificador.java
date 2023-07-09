package com.ifrs.edu.restinga.notificadorSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ifrs.edu.restinga.notificadorSpring.modelo.Cliente;
import com.ifrs.edu.restinga.notificadorSpring.servicos.AtivacaoClienteService;


@Controller
@RequestMapping("/")
public class ControllerNotificador {

	/*implementacao do slide Injetando dependencias*/

	//instancia da classe de ativacao gerenciada pelo spring
	private AtivacaoClienteService ativacaoClienteService;

	//definicao do construtor 
	public ControllerNotificador(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.printf("\nController na atividade :D\n");
	}


	@GetMapping("/notifica")
	@ResponseBody
	public String hello() {
		System.out.printf("\n Cliente sendo criado\n");
		Cliente cliente1 = new Cliente ("Joao", "joao@rtt", "555555");
		ativacaoClienteService.ativar(cliente1);
		return cliente1.getNome() + ": Ativacao Realizada com sucesso!";
	}
	
	

}
