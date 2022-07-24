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
        // calculaBalanciamento(raiz);
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

    public void remover(int valor, No no){
        if(valor == no.valor){
            if(no.anterior == null){
                this.raiz = null;
            }else if(no.proxEsqd == null && no.proxDirt == null){
                if(no.anterior.valor > valor){
                    no.anterior.proxEsqd = null;
                }else no.anterior.proxDirt = null;

            }else if(no.proxEsqd != null && no.proxDirt == null){
                if(no.anterior.valor > valor){
                    no.anterior.proxEsqd = no.proxEsqd;
                }else no.anterior.proxDirt = no.proxEsqd;

            }else if(no.proxEsqd == null && no.proxDirt != null){
                if(no.anterior.valor > valor){
                    no.anterior.proxEsqd = no.proxDirt;
                }else no.anterior.proxDirt = no.proxDirt;                
           
            }else{
                No noAux = no;
                while(noAux.proxDirt != null){
                    noAux = noAux.proxDirt;
                }
                noAux.anterior = no.anterior;
                noAux.proxEsqd = no.proxEsqd;
                noAux.proxDirt = no.proxDirt;
            }
        }else if(no.valor > valor){
            remover(valor, no.proxEsqd);
        }else if(no.valor < valor){
            remover(valor, no.proxDirt);
        }
    }
    
    public int calculaAltura(No no){
        if(no.proxEsqd == null && no.proxDirt == null){
            return 1;
        }else if (no.proxEsqd != null && no.proxDirt == null){
            return 1 + calculaAltura(no.proxEsqd);
        }else if (no.proxEsqd == null && no.proxDirt != null){
            return 1 + calculaAltura(no.proxDirt);
        }else{ 
            return 1 + Math.max(calculaAltura(no.proxEsqd), calculaAltura(no.proxDirt));
        }
    }

    public void calculaBalanciamento(No no){

        if(no.proxEsqd == null && no.proxDirt == null){
            no.bal = 0;
        }else if(no.proxEsqd != null && no.proxDirt == null){
            no.bal = 0 - calculaAltura(no.proxEsqd);
        }else if(no.proxEsqd == null && no.proxDirt != null){
            no.bal = calculaAltura(no.proxDirt) - 0;

        }else no.bal = calculaAltura(no.proxDirt) - calculaAltura(no.proxEsqd);
        
        if(no.proxEsqd != null) calculaBalanciamento(no.proxEsqd);
        if(no.proxDirt != null) calculaBalanciamento(no.proxDirt);
    }

    public String exibirArvore(int nivel, No no){
        String str = toString(no) + "\n";
      
        for(int i = 0; i < nivel; i++){
            str += "\t";
        }
        if(no.proxEsqd != null){
            str += "Esqd: " + exibirArvore(nivel +1,no.proxEsqd);
        }else str += "Esqd: Null";
        str += "\n";
        
        for(int i = 0; i < nivel; i++){
            str += "\t";
        }
        if(no.proxDirt != null){
            str += "Dirt: " + exibirArvore(nivel +1,no.proxDirt);
        }else str += "Dirt: Null";
        str += "\n";

        return str;
    }
    public String toString(No no){
        return "["+no.valor+"] ("+no.bal+")";
    }
}
