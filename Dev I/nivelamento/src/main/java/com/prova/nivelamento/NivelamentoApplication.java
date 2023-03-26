package com.prova.nivelamento;

import com.prova.nivelamento.domain.entity.Contato;
import com.prova.nivelamento.domain.entity.Telefone;
import com.prova.nivelamento.domain.repository.ContatosDao;
import com.prova.nivelamento.domain.repository.TelefonesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NivelamentoApplication {

	@Bean
	public CommandLineRunner init(@Autowired ContatosDao contatosDao, @Autowired TelefonesDao telefones) {
		return ars -> {
			Contato contato = new Contato("paula", "paula@hotmail.com");
			Telefone telefone = new Telefone(contato, "54 343242");
			contatosDao.save(contato);
			telefones.save(telefone);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(NivelamentoApplication.class, args);
	}
}



	//	@Autowired
//	@Qualifier("applicationName")
//	private String applicationName;
//	@GetMapping("/hello")
//	public String helloWord(){
//		return applicationName;
//	}
//	public static void main(String[] args) {
//		SpringApplication.run(NivelamentoApplication.class, args);
//	}


//contatosDao.findAll().forEach(System.out::println);
//			System.out.println(contatosDao.findById(20));

//			contatosDao.findContatoFechTelefone();

//			contatos.salvar(contato);
//
//			contatos.obterTodos().forEach(System.out::println);
//
//			contatos.deletar(5);
//
//			contatos.obterTodos().forEach(System.out::println);


//			List<Contato> todosContatos = contatos.obterTodos();
//			todosContatos.forEach(System.out::println);