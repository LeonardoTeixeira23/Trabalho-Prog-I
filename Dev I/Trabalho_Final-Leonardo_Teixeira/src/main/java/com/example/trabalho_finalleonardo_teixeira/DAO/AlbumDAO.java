package com.example.trabalho_finalleonardo_teixeira.DAO;

import com.example.trabalho_finalleonardo_teixeira.model.Album;
import com.example.trabalho_finalleonardo_teixeira.model.Cromo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumDAO extends GenericDAO<Album, Long> {

    List<Album> findByNomeContainingOrderByNomeAsc(String nome);
    List<Album> findByPaisSedeContainingOrderByPaisSedeAsc(String pais);
    List<Album> findByAnoGreaterThan(int ano);
    List<Album> findByCromosEspeciasGreaterThan(int quantidade);
    @Query("SELECT c.album FROM Cromo c WHERE c = :cromo")
    Album getAlbumByCromo(Cromo cromo);







}
