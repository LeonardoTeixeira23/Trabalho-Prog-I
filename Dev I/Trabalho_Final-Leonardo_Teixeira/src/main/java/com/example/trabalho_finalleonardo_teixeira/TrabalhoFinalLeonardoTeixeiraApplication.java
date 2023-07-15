package com.example.trabalho_finalleonardo_teixeira;

import com.example.trabalho_finalleonardo_teixeira.DAO.AlbumDAO;
import com.example.trabalho_finalleonardo_teixeira.DAO.CromoDAO;
import com.example.trabalho_finalleonardo_teixeira.model.Album;
import com.example.trabalho_finalleonardo_teixeira.model.Cromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TrabalhoFinalLeonardoTeixeiraApplication {

    @Autowired
    private CromoDAO cromoDAO;

    @Autowired
    private AlbumDAO albumDAO;

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoFinalLeonardoTeixeiraApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialData() {
        return (args) -> {
            // Criar dois objetos Album
            Album album1 = new Album("Álbum 1", "Brasil", 2023, Arrays.asList("Brasil", "Argentina", "Itália"), "Capa1");
            Album album2 = new Album("Álbum 2", "Portugal", 2024, Arrays.asList("Portugal", "Espanha", "França"), "Capa2");

            // Criar dez objetos Cromo
            Cromo cromo1 = new Cromo(false, false, "Versao1", "Cromo1");
            Cromo cromo2 = new Cromo(false, false, "Versao1", "Cromo2");
            Cromo cromo3 = new Cromo(false, false, "Versao1", "Cromo3");
            Cromo cromo4 = new Cromo(false, false, "Versao1", "Cromo4");
            Cromo cromo5 = new Cromo(false, true, "Versao1", "Cromo5");
            Cromo cromo6 = new Cromo(false, true, "Versao2", "Cromo6");
            Cromo cromo7 = new Cromo(false, true, "Versao2", "Cromo7");
            Cromo cromo8 = new Cromo(false, true, "Versao2", "Cromo8");
            Cromo cromo9 = new Cromo(false, false, "Versao2", "Cromo9");
            Cromo cromo10 = new Cromo(false, true, "Versao2", "Cromo10");

            // Definir o relacionamento entre os objetos Album e Cromo
            album1.addCromo(cromo1);
            album2.addCromo(cromo2);
            album1.addCromo(cromo3);
            album1.addCromo(cromo4);
            album1.addCromo(cromo5);
            album2.addCromo(cromo6);
            album2.addCromo(cromo7);
            album2.addCromo(cromo8);
            album2.addCromo(cromo9);
            album2.addCromo(cromo10);

            // Salvar os objetos Album e Cromo
            albumDAO.save(album1);
            albumDAO.save(album2);

            System.out.println(album1);
            for (Cromo c : cromoDAO.findByRaroTrue()){
                System.out.println(c);
            }

            System.out.println("===========================================================");
            Album a = albumDAO.getAlbumByCromo(cromo7);
            System.out.println(a.getNome());
        };
    }
}