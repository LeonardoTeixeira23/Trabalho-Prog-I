package com.example.habilitacao.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String nome;
    private String cpf;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Habilitacao.class,
    fetch = FetchType.EAGER)
    @JoinColumn(name = "id_habilitacao")
    private Habilitacao habilitacao;

    public Pessoa(String nome, String cpf, Habilitacao habilitacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacao habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", habilitacao=" + habilitacao +
                '}';
    }
}
