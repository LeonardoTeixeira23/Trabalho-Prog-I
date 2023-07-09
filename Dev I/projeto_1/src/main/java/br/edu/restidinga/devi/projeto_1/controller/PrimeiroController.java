package br.edu.restidinga.devi.projeto_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {

    @GetMapping("/alomundo")
    @ResponseBody
    public String olaMundo(){
        return "Olá mundo, ";
    }

}
