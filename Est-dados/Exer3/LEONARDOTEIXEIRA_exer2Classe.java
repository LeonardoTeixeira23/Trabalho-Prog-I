import java.util.Scanner;

public class LEONARDOTEIXEIRA_exer2Classe {
	Scanner kboard = new Scanner(System.in);
	
	int[] vetor;
	int ocupamVetor;
	int proxVazio;

    LEONARDOTEIXEIRA_exer2Classe(int tam) {
        
    	int vetTemp[] = new int[tam];
    	vetor = vetTemp;
    	ocupamVetor = 0;
    	proxVazio = 0;
    	
    }

	public int testaPosivtivo(int entrada){
		if (entrada > 0){
			return entrada;
		}else {
			System.out.print("\nValor invalido, por favor informe um novo valor: ");
			entrada = kboard.nextInt();
			return testaPosivtivo(entrada);
		}
	}
    
    public void zera() {
    	
    	for (int i=0; i < vetor.length; i++ ) {
    		vetor[i] = 0;
    	}
    			
    }
    public void insere(int entrada) {   	   	
    	
	    if(proxVazio < vetor.length) {
	    	vetor[proxVazio] = entrada;
	    	proxVazio++;
	    	ocupamVetor++;
	    }else {
	    	for(int i = 0; i < vetor.length;i++) {
				
				if(vetor[i] == 0) {
					vetor[i] = entrada;
					i = vetor.length;
				} else if(i == vetor.length-1) {
					System.out.print("\nInfelizmente o vetor está cheio");
				};
	    	};
		ocupamVetor++;
		};
    	
    };
    public void excluir(int entrada){
		
    	vetor[entrada] = 0;
		
		ocupamVetor--;
    };
    
    public void procuraValor(int entrada) {
  	
    	for (int i = 0; i < vetor.length;i++) {
    		if (vetor[i] != 0 && entrada == vetor[i]) {
    			System.out.print("\nValor localizado no index " + i);
    			i = vetor.length;
    		}else if (i == vetor.length - 1) {
    			System.out.println("\nO valor informado não foi localizado no vetor.");
    		};       		
    	};
    }
    
    public void qtdValoresVetor() {  
    	System.out.println("\nEste vetor tem " + ocupamVetor + " ocupadas");
    }
    
    public void maior() {
    	
    	int maior_numero = 0, index_maior = 0;

    	for (int i = 0; i < vetor.length; i++) {
    		if (vetor[i] > maior_numero) {
    			maior_numero = vetor[i];
    			index_maior = i;
    		}
    	}
    	System.out.println("\nO maior valor encontrado foi " + maior_numero +
    			" no index "+ index_maior);
    }
    
    public void menor(){
    	
    	int menor_numero = 0, index_menor = 0;
    	
    	for(int i = 0; i < vetor.length; i++) {
    		if(vetor[i] != 0) {
    			menor_numero = vetor[i];
    			index_menor = vetor[i];
    		}
    	}
    	
    	for (int i = 0; i < vetor.length; i++) {
    		if (vetor[i] != 0 && vetor[i] < menor_numero) {
    			menor_numero = vetor[i];
    			index_menor = i;
    		}
    	}
    	if(menor_numero != 0) {
    		System.out.println("\nO maior valor encontrado foi " + menor_numero +
    				" no index " + index_menor);
    	}else {
    		System.out.println("\nO vetor está vazio");
    	}
    }
    
    public void listaValores() {
      	
    	for(int i = 0; i < vetor.length; i++) {
    		if(vetor[i] != 0) {
    			System.out.print("\nO valor na posição [" + i + "] " + "é " + vetor[i] + " \n");
    		};
    	};
    	
    };
    
    	
    
}
