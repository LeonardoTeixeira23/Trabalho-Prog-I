public class Arvore{
    No raiz;
    
    public Arvore(){
        raiz = null;
    }
    
    public void inserir(int valor){
        No no = new No();
        no.valor = valor;

        if(raiz == null){
            this.raiz = no;
            System.out.println(no);
        }else{
          testeLados(no, raiz);
        }
            
    }
    
    public void testeLados(No no, No noAux){
        if(noAux.valor > no.valor){
            if(noAux.proxEsqd == null){
                noAux.proxEsqd = no;
                no.anterior = noAux;
            }else  testeLados(no, noAux.proxEsqd);
        }else if(noAux.valor < no.valor){
                 if(noAux.proxDirt == null){
                    noAux.proxDirt = no;
                    no.anterior = noAux;
                }else testeLados(no, noAux.proxDirt); 
            }
    }
    
    public void exibir(No noAux){
        if(noAux.proxEsqd != null){
            exibir(noAux.proxEsqd);
        }
        System.out.print(noAux.valor + " ");
        if(noAux.proxDirt != null){
            exibir(noAux.proxDirt);
        }    
    }

    public void busca(int valor, No noAux){
        if(valor == noAux.valor){
            System.out.println("valor encontrado");
        }else if(valor < noAux.valor){
            if(noAux.proxEsqd == null){
                System.out.println("valor não encontrado"); 
            }else busca(valor, noAux.proxEsqd);
        }else if (valor > noAux.valor){
            if(noAux.proxDirt == null){
                System.out.println("valor não encontrado"); 
            }else busca(valor, noAux.proxDirt);
        }
    }
    
}