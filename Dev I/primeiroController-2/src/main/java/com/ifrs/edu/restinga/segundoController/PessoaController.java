package com.ifrs.edu.restinga.segundoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PessoaController {

	
	@RequestMapping("/exemploDadoComplexo") 
	@ResponseBody
	public Pessoa exemploDadoComplexo() {
		final Pessoa pessoa = new Pessoa(); 
		pessoa.setNome("Maria do Exemplo"); 
		pessoa.setEmail("maria@exemplo.com"); 
		pessoa.setIdade(29); 
		pessoa.setTelefones(
				new String[]{"16816874", "156465"}); 
		return pessoa;
	}

}
