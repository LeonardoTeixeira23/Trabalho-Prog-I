package br.com.brasfoot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(scale = 3, length = 100)
    private String nome;
    @Column(scale = 2, length = 40)
    private String apelido;
    private Date fundacao;
    @Column(scale = 5, length = 50)
    private String cidade;

    public Time(String nome, Date fundacao, String cidade) {
        this.nome = nome;
        this.fundacao = fundacao;
        this.cidade = cidade;
    }



    /************GETTER'S AND SETTER'S*****************/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
