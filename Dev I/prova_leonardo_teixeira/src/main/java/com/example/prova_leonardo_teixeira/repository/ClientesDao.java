package com.example.prova_leonardo_teixeira.repository;

import com.example.prova_leonardo_teixeira.entity.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientesDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void salvar(Cliente cliente){
        entityManager.merge(cliente);
    }

    public List<Cliente> listagem(){
        TypedQuery<Cliente> query = entityManager.createQuery("FROM Cliente", Cliente.class);

        return query.getResultList();
    }

    public Cliente buscarId(int id){
        return entityManager.find(Cliente.class,id);
    }

    @Transactional
    public void remover(Cliente cliente){
        entityManager.remove(buscarId(cliente.getId()));
    }

    @Transactional
    public void atualizar(Cliente cliente){
        entityManager.merge(cliente);
    }
}
