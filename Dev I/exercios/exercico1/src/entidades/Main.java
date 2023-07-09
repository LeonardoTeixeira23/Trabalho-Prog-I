package entidades;

import service.AtivacaoCliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leonardo", "leo@gmail.com", "(51) 99122-1212");

        AtivacaoCliente ativacaoCliente = new AtivacaoCliente(cliente);

        ativacaoCliente.ativaCliente();


    }
}