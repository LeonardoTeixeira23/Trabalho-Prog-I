package com.example.exercicio_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculaImc {
    @RequestMapping("/imc/{peso}/{altura}")
    @ResponseBody
    public String calculaImc(@PathVariable float peso,@PathVariable float altura){
        final float imc = peso/(altura*altura);
        if(imc <= 18.5){
            return " Magreza";
        }else if(imc <= 24.9){
            return "Saudável";
        }else if(imc <= 29.9){
            return "Sobrepeso";
        }else if(imc <= 34.9){
            return "Obesidade Grau I";
        }else if(imc <= 39.9){
            return "Obesidade Grau II (severa)";
        }else{
            return "Obesidade Grau III (mórbida)";
        }
    }
}
