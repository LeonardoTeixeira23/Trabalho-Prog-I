package br.ifrs.edu.restinga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {
	
	@GetMapping("/aloMundo")
	@ResponseBody
	public String aloMundo() {
		return "Alo mundo - DEV 1";
	}



}