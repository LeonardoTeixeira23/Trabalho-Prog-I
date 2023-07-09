package com.ifrs.edu.restinga.segundoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PessoaController2 {

	
	@RequestMapping("/exemploPost")
	@ResponseBody
	public String exemploPost(@RequestBody Pessoa pessoa) 
	{ 
		return "Nome do teste:"+pessoa.getNome()+
				"\n"+
				"Idade do teste:"+pessoa.getIdade()+
				"\n"+
				"Email do teste:"+pessoa.getEmail()+
				"\n" +"Telefones:"+
				String.join(",", pessoa.getTelefones());
	}

}
