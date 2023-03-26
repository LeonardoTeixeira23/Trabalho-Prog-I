package com.prova.nivelamento.domain.controller;

import com.prova.nivelamento.domain.entity.Contato;
import com.prova.nivelamento.domain.repository.ContatosDao;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ContatoController {

    private ContatosDao contatosDao;

    public ContatoController(ContatosDao contatosDao) {
        this.contatosDao = contatosDao;
    }

    @GetMapping("/contato/buscarPorId/{id}")
    @ResponseBody
    public ResponseEntity findContatoById(@PathVariable int id){
        Optional<Contato> contato = contatosDao.findById(id);

        if(contato.isPresent()){
            return ResponseEntity.ok(contato.get());
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/contato/buscarTodos")
    @ResponseBody
    public ResponseEntity<List<Contato>> findAll() {
        List<Contato> contatos = contatosDao.findAll();
        return ResponseEntity.ok(contatos);
    }

    @PostMapping("/contato/salvar")
    @ResponseBody
    public ResponseEntity save(@RequestBody Contato contato){
        Contato contatoSalvo = contatosDao.save(contato);
        return ResponseEntity.ok(contatoSalvo);
    }

}
