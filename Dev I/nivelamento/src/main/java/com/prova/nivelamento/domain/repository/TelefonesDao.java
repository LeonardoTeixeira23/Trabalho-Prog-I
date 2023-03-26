package com.prova.nivelamento.domain.repository;

import com.prova.nivelamento.domain.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonesDao extends JpaRepository<Telefone, Integer> {
}
