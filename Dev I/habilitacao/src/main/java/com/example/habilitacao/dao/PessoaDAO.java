package com.example.habilitacao.dao;

import com.example.habilitacao.model.Habilitacao;
import com.example.habilitacao.model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaDAO extends GenericCrudRepository<Pessoa, Long>{

    List<Pessoa> findByNomeContaining(String nome);

    Pessoa findDistinctByNome(String nome);

    @Query(nativeQuery = true, value = "SELECT * FROM pessoa  WHERE  LIKE %:categoria%")
    List<Pessoa> pesquisaPorCategoria(String categoria);
}
