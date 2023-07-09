package br.ifrs.edu.restinga.jpa;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroCozinha {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Cozinha> listar(){
        TypedQuery<Cozinha> query = entityManager.createQuery("FROM Cozinha", Cozinha.class);
        return query.getResultList();
    }
    @Transactional
    public void adicionar(Cozinha cozinha){
        entityManager.merge(cozinha);
    }


    public Cozinha buscar(Long id){
        return entityManager.find(Cozinha.class, id);
    }

    @Transactional
    public void remover(Cozinha cozinha){
        entityManager.remove(buscar((Long) cozinha.getId()));
    }
}
