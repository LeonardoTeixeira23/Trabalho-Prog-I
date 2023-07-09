package com.example.prova_leonardo_teixeira;

import com.example.prova_leonardo_teixeira.entity.Livro;
import com.example.prova_leonardo_teixeira.repository.LivroDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProvaLeonardoTeixeiraApplication {

    public static void main(String[] args){
//      SpringApplication.run(ProvaLeonardoTeixeiraApplication.class, args);
        ApplicationContext applicationContext =
                new SpringApplicationBuilder(ProvaLeonardoTeixeiraApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        LivroDao livroDao = applicationContext.getBean(LivroDao.class);

        Livro livro1 = new Livro();
        livro1.setTitulo("O senhor dos aneis");
        livro1.setAutorPrimeiroNome("J.R.R");
        livro1.setAutorSegundoNome("Tolkein");
        livro1.setAnoPublicacao("1953");
        livro1.setEditora("Arqueiro");
        livro1.setDoacao(true);
        livroDao.salvar(livro1);

        Livro livro2 = new Livro();
        livro2.setTitulo("O guia do mochileiro das galaxias");
        livro2.setAutorPrimeiroNome("Douglas");
        livro2.setAutorSegundoNome("Adams");
        livro2.setAnoPublicacao("1989");
        livro2.setEditora("Arqueiro");
        livroDao.salvar(livro2);

        for (Livro livro: livroDao.listagem()) {
            System.out.println(livro.getTitulo());
        }

        livroDao.buscarId(1);

        Livro livroAtualizar = livro2;
        livro2.setId(2);
        livro2.setEditora("Ursa maior");
        livroDao.atualizar(livro2);

        for (Livro livro: livroDao.listagem()) {
            System.out.println(livro.getTitulo() + ": " + livro.getEditora());
        }

        Livro livroDelete = new Livro();
        livroDelete.setId(2);
        livroDao.remover(livroDelete);

        for (Livro livro: livroDao.listagem()) {
            System.out.println(livro.getTitulo());
        }


    }

}
