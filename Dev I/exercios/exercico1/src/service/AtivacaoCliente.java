package service;

import entidades.Cliente;

public class AtivacaoCliente {
    private boolean teste;

    public boolean isTeste() {
        return teste;
    }

    public void setTeste(boolean teste) {
        this.teste = teste;
    }

    private Cliente cliente;
    public AtivacaoCliente(Cliente cliente){
        this.cliente = cliente;
    }


    public void ativaCliente(){
        cliente.setAtivo(true);
        System.out.println("O cliente esta ativo");
    }

}
