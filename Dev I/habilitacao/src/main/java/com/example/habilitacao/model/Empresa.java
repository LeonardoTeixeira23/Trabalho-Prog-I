package com.example.habilitacao.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(length = 14)
    private String cnpj;
    private String nomeFantasia;

    @OneToMany
    @JoinColumn(name = "empresa_id")
    private ArrayList<Departamento> departamentos;
}
