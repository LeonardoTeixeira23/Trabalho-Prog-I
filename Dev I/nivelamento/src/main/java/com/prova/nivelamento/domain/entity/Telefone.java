package com.prova.nivelamento.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="telefone", schema = "nivelamento")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "contato_id")
    @JsonIgnoreProperties("telefones")
    private Contato contato_id;
    @Column(name = "numero", length = 100)
    private String numero;

    public Telefone(Contato contato_id, String numero) {
        this.contato_id = contato_id;
        this.numero = numero;
    }

    public Telefone() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato getContato_id() {
        return contato_id;
    }

    public void setContato_id(Contato contado_id) {
        this.contato_id = contado_id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String nome) {
        this.numero = nome;
    }

}
