package br.ifrs.edu.restinga;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import br.ifrs.edu.restinga.jpa.CadastroCozinha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import java.util.List;

@SpringBootApplication
public class PersistenciaSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PersistenciaSpringApplication.class, args);
		ApplicationContext applicationContext =
				new SpringApplicationBuilder(PersistenciaSpringApplication.class)
						.web(WebApplicationType.NONE)
						.run(args);
		CadastroCozinha cadastro = applicationContext.getBean(CadastroCozinha.class);

		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Japonesa");
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Uruguaia");

		cadastro.adicionar(cozinha1);
		cadastro.adicionar(cozinha2);

		List<Cozinha> lista = cadastro.listar();

		for (Cozinha x: lista) {
			System.out.println(x.getId()+ ": " + x.getNome());
		}

		Cozinha cozinhaBusca = cadastro.buscar(2L);

		System.out.println(cozinhaBusca.getNome());

		Cozinha cozinhaAtualiza = new Cozinha();
		cozinhaAtualiza.setNome("Brazuca");
		cozinhaAtualiza.setId(2L);

		cadastro.adicionar(cozinhaAtualiza);

		Cozinha cozinhaDeletar = new Cozinha();
		cozinhaDeletar.setId(2L);
		cadastro.remover(cozinhaDeletar);

		lista = cadastro.listar();
		for (Cozinha x: lista) {
			System.out.println(x.getId()+ ": " + x.getNome());
		}
	}

}
