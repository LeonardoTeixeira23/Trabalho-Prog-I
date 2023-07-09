package com.example.prova_leonardo_teixeira;


import com.example.prova_leonardo_teixeira.entity.Cliente;
import com.example.prova_leonardo_teixeira.repository.ClientesDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class MainClientes {

    public static void main(String[] args){
//      SpringApplication.run(ProvaLeonardoTeixeiraApplication.class, args);
        ApplicationContext applicationContext =
                new SpringApplicationBuilder(MainClientes.class)
                        .web(WebApplicationType.NONE)
                        .run(args);
        ClientesDao clientesDao = applicationContext.getBean(ClientesDao.class);

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Jorge Campary");
        cliente1.setCpf("987.654.321-12");
        cliente1.setEmail("jorgeMaster@campary.com");
        cliente1.setTelefones(new String[]{"979845687", "4564656465"});
        clientesDao.salvar(cliente1);

        for (Cliente cliente: clientesDao.listagem()) {
            System.out.println(cliente.toString());
        }

        Cliente clienteAtualiza = cliente1;
        clienteAtualiza.setId(1);
        cliente1.setNome("Jorginho Campary");
        clientesDao.atualizar(clienteAtualiza);

        System.out.println(clientesDao.buscarId(1).toString());

        Cliente clienteDelete = new Cliente();
        clienteDelete.setId(1);
//        clientesDao.remover(clienteDelete);
    }

}
