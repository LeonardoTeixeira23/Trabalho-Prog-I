package com.example.prova_leonardo_teixeira.entity;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Cliente2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(nullable = false)
    private String email;
    @ElementCollection
    private List<String> Telefones;

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
        if (nome.length() < 10){
            System.out.println("O nome deve ter mais de 10 caracteres");
        }else if(nome.length() > 100){
            System.out.println("O nome deve ter menos de 100 caracteres");
        }else this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() < 11){
            System.out.println("CPF invalido");
        }else this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTelefones() {
        return Telefones;
    }

//    public void setTelefones(String[] telefones) {
//        if (telefones.length > 2){
//            System.out.println("Não podem ser cadastrados mais de 2 telefones");
//        }else
//    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefones='" + Telefones + '\'' +
                '}';
    }
}
