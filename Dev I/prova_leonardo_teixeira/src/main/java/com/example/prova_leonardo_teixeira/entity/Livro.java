package com.example.prova_leonardo_teixeira.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.ParserInterpreter;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100, scale = 10)
    private String titulo;
    @Column(nullable = false)
    private String autorPrimeiroNome;
    @Column
    private String autorSegundoNome;
    @Column
    private String anoPublicacao;
    @Column(nullable = false)
    private String editora;
    @Column
    private boolean doacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() < 10){
            System.out.println("O titulo deve ter mais de 10 caracteres");
        }else if(titulo.length() > 100){
            System.out.println("O titulo deve ter menos de 100 caracteres");
        }else this.titulo = titulo;
    }

    public String getAutorPrimeiroNome() {
        return autorPrimeiroNome;
    }

    public void setAutorPrimeiroNome(String autorPrimeiroNome) {
        this.autorPrimeiroNome = autorPrimeiroNome;
    }

    public String getAutorSegundoNome() {
        return autorSegundoNome;
    }

    public void setAutorSegundoNome(String autorSegundoNome) {

        this.autorSegundoNome = autorSegundoNome;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        int ano = Integer.parseInt(anoPublicacao);
        if(ano < 1800 || ano > 2023) {
            System.out.println("São aceitos livros publicados somente entre 1800 e 2023");
        }else {
            this.anoPublicacao = anoPublicacao;
        }

    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDoacao() {
        return doacao;
    }

    public void setDoacao(boolean doacao) {
        this.doacao = doacao;
    }
}
