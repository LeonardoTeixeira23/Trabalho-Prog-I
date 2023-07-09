package com.example.exercicio_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
public class DiaSemana {
    @RequestMapping("/diaSemana/{ano}/{mes}/{dia}")
    @ResponseBody
    public String pegarDiaSemana(@PathVariable int ano,
                                 @PathVariable int mes,
                                 @PathVariable int dia)
    {
        LocalDate data = LocalDate.of(ano, mes, dia);
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        return diaDaSemana.getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
    }
}
