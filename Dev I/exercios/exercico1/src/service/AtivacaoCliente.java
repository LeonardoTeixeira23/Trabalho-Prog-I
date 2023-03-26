package service;

import aplicacao.Cliente;
public class AtivacaoCliente {
    Cliente cliente;
    public AtivacaoCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void clienteAtivo(){
        if(this.cliente.isAtivo()){
            System.out.println("Seu cliente esta ativo");
        }else {
            System.out.println("Este cliente não esta ativo");
        }
    }

}
