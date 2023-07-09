package com.example.exercicio_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calculadora")
public class Calculadora {

    @GetMapping("/adicao")
    @ResponseBody
    public String adicao(@RequestParam("n1") double num1, @RequestParam("n2") double num2) {
        double resultado =  num1 + num2;
        return "O resultado da adição é: " + resultado;
    }

    @GetMapping("/subtracao")
    @ResponseBody
    public String subtracao(@RequestParam("n1") double num1, @RequestParam("n2") double num2) {
        double resultado = num1 - num2;
        return "O resultado da subtração é: " + resultado;
    }

    @GetMapping("/multiplicacao")
    @ResponseBody
    public String multiplicacao(@RequestParam("n1") double num1, @RequestParam("n2") double num2) {
        double resultado = num1 * num2;
        return "O resultado da multiplicação é: " + resultado;
    }

    @GetMapping("/divisao")
    @ResponseBody
    public String divisao(@RequestParam("n1") double num1, @RequestParam("n2") double num2) {
        if (num2 == 0) {
            return "Não é possível realizar divisão por zero.";
        } else {
            double resultado = num1 / num2;
            return "O resultado da divisão é: " + resultado;
        }
    }
}

