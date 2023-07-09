package br.com.brasfoot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    @Size(min = 10, max = 100)
    private String nome;
    @Column(length = 60)
    @Size(min = 10, max = 60)
    private String nacionalidade;
    private Date nascimento;
    @Column(length = 40)
    @Size(min = 2, max = 40)
    private String apelido;
    @Column(length = 40)
    @Size(min = 3, max = 40)
    private String posicao;
    @Min(1)
    private int qualidade;
    @Min(0)
    private int cartoes;
    private boolean suspenso;


    public Jogador(String nome, String nacionalidade, Date nascimento, String posicao, int qualidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", nascimento=" + nascimento +
                ", apelido='" + apelido + '\'' +
                ", posicao='" + posicao + '\'' +
                ", qualidade=" + qualidade +
                ", cartoes=" + cartoes +
                ", suspenso=" + suspenso +
                '}';
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }



}
