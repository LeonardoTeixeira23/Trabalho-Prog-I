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
            System.out.println("Valor removido");
        }else if(no.valor > valor){
            remover(valor, no.proxEsqd);
        }else if(no.valor < valor){
            remover(valor, no.proxDirt);
        }else System.out.println("Valor não encontrado");
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

    public void verificaBalanciamento(No no){
        if(no.bal >= 2 || no.bal <= -2){
            if(no.bal >= 2){
                if(no.bal * no.proxDirt.bal > 0){
                    trocaSimpleDirt(no);
                }else trocaDuplaDirt(no);
            }else{
                if(no.bal * no.proxEsqd.bal > 0){
                   trocaSimpleEsqd(no);
                }else trocaDuplaEsqd(no);
            }
        }
        calculaBalanciamento(raiz);
        if(no.proxEsqd != null) verificaBalanciamento(no.proxEsqd);
        if(no.proxDirt != null) verificaBalanciamento(no.proxDirt);
    }

    public void trocaSimpleDirt(No no){
        No proxDirt = no.proxDirt;
        No filhoDoFilho;

        if(proxDirt.proxEsqd != null){
            filhoDoFilho = no.proxEsqd;
            filhoDoFilho.anterior = no;
        }
        no.proxDirt = proxDirt.proxEsqd;
        proxDirt.proxEsqd = no;
        proxDirt.anterior = no.anterior;
        no.anterior = proxDirt;
        if(proxDirt.anterior == null) raiz = proxDirt;
    }

    public void trocaSimpleEsqd(No no){
        No proxEsqd = no.proxEsqd;
        No filhoDoFilho;

        if(proxEsqd.proxDirt != null){
            filhoDoFilho = no.proxDirt;
            filhoDoFilho.anterior = no;
        }
        no.proxEsqd = proxEsqd.proxDirt;
        proxEsqd.proxDirt = no;
        proxEsqd.anterior = no.anterior;
        no.anterior = proxEsqd;
        if(proxEsqd.anterior == null) raiz = proxEsqd;
    }

    public void trocaDuplaDirt(No no){
        No proxDirt = no.proxDirt;
        No filhoDoFilho = proxDirt.proxEsqd;
        No noInserido = filhoDoFilho.proxDirt;

        //Alinha nos11

        if(no.proxEsqd == null){
            no.proxDirt = filhoDoFilho;

            filhoDoFilho.anterior = no;
            filhoDoFilho.proxDirt = proxDirt;

            proxDirt.anterior = filhoDoFilho;
            proxDirt.proxEsqd = null;
        }else{
            no.proxDirt = filhoDoFilho;
            filhoDoFilho.anterior = no;
            filhoDoFilho.proxDirt = proxDirt;
            proxDirt.proxEsqd = noInserido;
            noInserido.anterior = proxDirt;
            proxDirt.anterior = filhoDoFilho;
        }
        trocaSimpleDirt(no);
    }

    public void trocaDuplaEsqd(No no){
        No proxEsqd = no.proxEsqd;
        No filhoDoFilho = proxEsqd.proxDirt;
        No noInserido = filhoDoFilho.proxEsqd;

        if(no.proxDirt == null){
            no.proxEsqd = filhoDoFilho;

            filhoDoFilho.anterior = no;
            filhoDoFilho.proxEsqd = proxEsqd;

            proxEsqd.anterior = filhoDoFilho;
            proxEsqd.proxDirt = null;
        }else{
            no.proxDirt = filhoDoFilho;
            filhoDoFilho.anterior = no;

            filhoDoFilho.proxEsqd = proxEsqd;
            proxEsqd.proxDirt = noInserido;

            noInserido.anterior = proxEsqd;
            proxEsqd.anterior = filhoDoFilho;
        }
        trocaSimpleEsqd(no);
    }
    
    public String exibirArvore(int nivel, No no){
        String str = toString(no) + "\n";
      
        for(int i = 0; i < nivel; i++){
            str += "\t";
        }
        if(no.proxEsqd != null){
            str += "+--Esqd: " + exibirArvore(nivel +1,no.proxEsqd);
        }else str += "+--Esqd: Null";
        str += "\n";
        
        for(int i = 0; i < nivel; i++){
            str += "\t";
        }
        if(no.proxDirt != null){
            str += "+--Dirt: " + exibirArvore(nivel +1,no.proxDirt);
        }else str += "+--Dirt: Null";
        str += "\n";

        return str;
    }
    
    public String toString(No no){
        return "["+no.valor+"] ("+no.bal+")";
    }
}
