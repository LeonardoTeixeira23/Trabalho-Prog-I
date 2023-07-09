package com.example.habilitacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Habilitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String numero;
    @Temporal(TemporalType.DATE)
    private LocalDate validade;
    private String categoria;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Habilitacao(String numero, String categoria) {
        this.numero = numero;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", validade=" + validade +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
