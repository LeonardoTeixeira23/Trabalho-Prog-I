package com.example.trabalho_finalleonardo_teixeira.DAO;

import com.example.trabalho_finalleonardo_teixeira.model.Album;
import com.example.trabalho_finalleonardo_teixeira.model.Cromo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CromoDAO extends GenericDAO<Cromo, Long>{

    List<Cromo> findByRaroTrue();
    List<Cromo> findBySelecaoContainingOrderBySelecaoDesc(String selecao);
    List<Cromo> findByPosicaoContainingOrderByPosicaoDesc(String posicao);
    List<Cromo> findByPosicaoContainingAndSelecaoContainingOrderBySelecaoDesc(String posicao,String selecao);

//    @Query("SELECT album.cromo FROM Album album WHERE album = :album")
    @Query(value = "SELECT cromo FROM Cromo cromo WHERE cromo.album = :album")
    List<Cromo> getCromosByAlbum(Album album);

    @Query(value = "SELECT cromo FROM Cromo cromo WHERE cromo.album = :album AND cromo.selecao = :selecao")
    List<Cromo> getCromosByAlbumAndSelecao(Album album, String selecao);





}
