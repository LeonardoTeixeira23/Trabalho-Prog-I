package com.example.habilitacao;

import com.example.habilitacao.dao.HabilitacaoDAO;
import com.example.habilitacao.dao.PessoaDAO;
import com.example.habilitacao.model.Pessoa;
import com.example.habilitacao.model.Habilitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HabilitacaoApplication {
    @Autowired
    PessoaDAO pessoaDAO;
    @Autowired
    HabilitacaoDAO habilitacaoDAO;

    public static void main(String[] args) {
        SpringApplication.run(HabilitacaoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialData(){
        return (args) ->{

            Habilitacao h1= new Habilitacao("21323","B" );
            Pessoa p1 = new Pessoa("dasd", "dasd", h1);
            Habilitacao h2 = new Habilitacao("43256", "A");
            Pessoa p2 = new Pessoa("João", "Silva", h2);
            Habilitacao h3 = new Habilitacao("89745", "C");
            Pessoa p3 = new Pessoa("Maria", "Souza", h3);
            Habilitacao h4 = new Habilitacao("67589", "D");
            Pessoa p4 = new Pessoa("Carlos", "Ferreira", h4);
            Habilitacao h5 = new Habilitacao("12345", "E");
            Pessoa p5 = new Pessoa("Ana", "Santos", h5);
            Habilitacao h6 = new Habilitacao("78901", "AB");
            Pessoa p6 = new Pessoa("Rafael", "Gomes", h6);
            Habilitacao h7 = new Habilitacao("23456", "BC");
            Pessoa p7 = new Pessoa("Juliana", "Lima", h7);
            Habilitacao h8 = new Habilitacao("67890", "CD");
            Pessoa p8 = new Pessoa("Pedro", "Martins", h8);
            Habilitacao h9 = new Habilitacao("34567", "DE");
            Pessoa p9 = new Pessoa("Mariana", "Rocha", h9);
            Habilitacao h10 = new Habilitacao("90123", "ABC");
            Pessoa p10 = new Pessoa("Lucas", "Almeida", h10);

            p1.setHabilitacao(h1);

            pessoaDAO.save(p1);
            pessoaDAO.save(p2);
            pessoaDAO.save(p3);
            pessoaDAO.save(p4);
            pessoaDAO.save(p5);
            pessoaDAO.save(p6);
            pessoaDAO.save(p7);
            pessoaDAO.save(p8);
            pessoaDAO.save(p9);
            pessoaDAO.save(p10);

            List<Pessoa> resultado = pessoaDAO.pesquisaPorCategoria("B");

            for (Pessoa p: resultado) {
                System.out.println(p.toString());
            }


        };
    }

}
