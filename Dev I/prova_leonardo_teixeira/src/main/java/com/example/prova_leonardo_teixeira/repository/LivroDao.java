package com.example.prova_leonardo_teixeira.repository;


import com.example.prova_leonardo_teixeira.entity.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void salvar(Livro livro){
        entityManager.merge(livro);
    }

    public List<Livro> listagem(){
        TypedQuery<Livro> query = entityManager.createQuery("FROM Livro", Livro.class);

        return query.getResultList();
    }

    public Livro buscarId(int id){
        return entityManager.find(Livro.class,id);
    }

    @Transactional
    public void remover(Livro livro){
        entityManager.remove(buscarId(livro.getId()));
    }

    @Transactional
    public void atualizar(Livro livro){
        entityManager.merge(livro);
    }
}
