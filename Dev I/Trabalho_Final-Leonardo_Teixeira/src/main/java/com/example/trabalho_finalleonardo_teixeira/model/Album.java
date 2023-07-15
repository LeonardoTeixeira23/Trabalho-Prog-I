package com.example.trabalho_finalleonardo_teixeira.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Size(min = 10, max = 100)
    private String nome;

    @NotNull
    @Size(min = 3, max = 100)
    private String paisSede;

    @NotNull
    private int ano;

    @NotNull
    @Size(min = 3, max = 100)
    @ElementCollection
    private List<String> selecoes;

    @NotNull
    @Size(min = 4, max = 100)
    private String capa;

    @OneToMany(targetEntity = Cromo.class, fetch = FetchType.EAGER, mappedBy = "album",
    cascade = CascadeType.ALL)
    private List<Cromo> cromo = new ArrayList<Cromo>();

    private int cromos;
    private int cromosEspecias;
    private int cromosExtras;

    public Album(String nome, String paisSede, int ano, List<String> selecoes, String capa) {
        this.nome = nome;
        this.paisSede = paisSede;
        this.ano = ano;
        this.selecoes = selecoes;
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", paisSede='" + paisSede + '\'' +
                ", ano=" + ano +
                ", selecoes=" + selecoes +
                ", capa='" + capa + '\'' +
//                ", cromo=" + cromo +
                ", cromos=" + cromos +
                ", cromosEspecias=" + cromosEspecias +
                ", cromosExtras=" + cromosExtras +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 10 && nome.length() <= 100) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O campo nome deve ter entre 10 e 100 caracteres");
        }
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        if (paisSede != null && paisSede.length() >= 3 && paisSede.length() <= 100) {
            this.paisSede = paisSede;
        } else {
            throw new IllegalArgumentException("O campo paisSede deve ter entre 3 e 100 caracteres");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<String> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(List<String> selecoes) {
        if (selecoes != null && selecoes.size() >= 3 && selecoes.size() <= 100) {
            this.selecoes = selecoes;
        } else {
            throw new IllegalArgumentException("A lista de selecoes deve ter entre 3 e 100 elementos");
        }
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        if (capa != null && capa.length() >= 4 && capa.length() <= 100) {
            this.capa = capa;
        } else {
            throw new IllegalArgumentException("O campo capa deve ter entre 4 e 100 caracteres");
        }
    }

    public int getCromos() {
        return cromos;
    }

    public void setCromos(int cromos) {
        this.cromos = cromos;
    }

    public int getCromosEspecias() {
        return cromosEspecias;
    }

    public void setCromosEspecias(int cromosEspecias) {
        this.cromosEspecias = cromosEspecias;
    }

    public int getCromosExtras() {
        return cromosExtras;
    }

    public void setCromosExtras(int cromosExtras) {
        this.cromosExtras = cromosExtras;
    }


    public List<Cromo> getCromo() {
        return cromo;
    }

    public void addCromo(Cromo cromo) {
        cromo.setAlbum(this);
        this.cromo.add(cromo);
    }

}
