package com.example.trabalho_finalleonardo_teixeira.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
public class Cromo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean extra;

    private boolean raro;

    @NotNull
    @Column(length = 10)
    private String versao;

    @NotNull
    @Size(min = 3, max = 100)
    private String nome;

    private LocalDate nascimento;

    @Column(length = 3)
    private String selecao;

    @Column(length = 3)
    private String posicao;

    private Integer anoConvocacao;

    @Min(0)
    private Double altura;

    private Integer peso;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Album.class,
            fetch = FetchType.EAGER, optional = true)
    private Album album;


    public Cromo(boolean extra, boolean raro, String versao, String nome) {
        this.extra = extra;
        this.raro = raro;
        this.versao = versao;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public boolean isRaro() {
        return raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        if (versao != null && versao.length() <= 10) {
            this.versao = versao;
        } else {
            throw new IllegalArgumentException("O campo versao deve ter no máximo 10 caracteres");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3 && nome.length() <= 100) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O campo nome deve ter entre 3 e 100 caracteres");
        }
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        if (selecao == null || selecao.length() == 3) {
            this.selecao = selecao;
        } else {
            throw new IllegalArgumentException("O campo selecao deve ter exatamente 3 caracteres");
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        if (posicao == null || posicao.length() == 3) {
            this.posicao = posicao;
        } else {
            throw new IllegalArgumentException("O campo posicao deve ter exatamente 3 caracteres");
        }
    }

    public Integer getAnoConvocacao() {
        return anoConvocacao;
    }

    public void setAnoConvocacao(Integer anoConvocacao) {
        this.anoConvocacao = anoConvocacao;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if (altura == null || altura >= 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("O campo altura deve ser um valor positivo");
        }
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cromo{" +
                "id=" + id +
                ", extra=" + extra +
                ", raro=" + raro +
                ", versao='" + versao + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", selecao='" + selecao + '\'' +
                ", posicao='" + posicao + '\'' +
                ", anoConvocacao=" + anoConvocacao +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
