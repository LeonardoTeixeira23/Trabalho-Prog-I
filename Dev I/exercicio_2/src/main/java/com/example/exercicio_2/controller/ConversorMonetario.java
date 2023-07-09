package com.example.exercicio_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConversorMonetario {
    @GetMapping("/conversor/{valor}")
    @ResponseBody
    public float[] conversor(@PathVariable float valor){
        final  float[] resultado = {(valor * 5.80f), (valor * 6.10f), (valor * 7.32f)};
        return resultado;
    }
    //

    @GetMapping("/conversor")
    @ResponseBody
    public float[] conversorRequest(@RequestParam("valor") float valor){
        final  float[] resultado = {(valor * 5.80f), (valor * 6.10f), (valor * 7.32f)};
        return resultado;
    }
    // RequestParam é mais utilizado para funções get consulta, passando
    // usando "Kwargs", mais utilizado para consulta
}
