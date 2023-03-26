package com.prova.nivelamento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
@dev
public class config {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Prova de nivelamento";
    }
}
