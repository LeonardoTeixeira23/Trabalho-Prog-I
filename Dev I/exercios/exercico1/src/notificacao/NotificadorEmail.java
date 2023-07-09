package notificacao;

import entidades.Cliente;
import entidades.Produto;
import service.AtivacaoCliente;

public class NotificadorEmail {

    public void notificar(Cliente cliente, String msg){
        System.out.println(msg );
    }
}
