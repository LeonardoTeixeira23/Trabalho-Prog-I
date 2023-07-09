package com.example.exercicio_2.controller;

import com.example.exercicio_2.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExemplo2 {
    @RequestMapping("/exemploDadoComplexo")
    @ResponseBody
    public Pessoa exemploDadoComplexo() {
        final Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria do Exemplo");
        pessoa.setEmail("maria@exemplo.com");
        pessoa.setIdade(29);
        pessoa.setTelefones(
                new String[]{"16816874", "156465"});
        return pessoa;
    }

    @RequestMapping("/exemploPost")
    @ResponseBody
    public String exemploPost(@RequestBody Pessoa pessoa) {
        return "Nome:"+pessoa.getNome()+"\n"
                +"Idade:"+pessoa.getIdade()+"\n"
                +"Email:"+pessoa.getEmail()+"\n"
                +"Telefones:"+String.join(",", pessoa.getTelefones());
    }
}