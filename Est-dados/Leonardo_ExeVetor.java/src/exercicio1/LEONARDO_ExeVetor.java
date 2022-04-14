package exercicio1;
import java.util.Scanner;


public class LEONARDO_ExeVetor{
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int vetor[]= new int[20], key;
        boolean fim_loop = false;
 


        while (fim_loop == false ) {
        	
        	System.out.println("[1] criar o vetor vazio ou \"zerar o vetor\"\n"
        			+ "[2] inserir um valor no vetor\n"
        			+ "[3] apagar um valor do vetor\n"
        			+ "[4] consultar se existe determinado valor no vetor\n");
        	key = kboard.nextInt();
        	
            switch (key) {
                case 1:    
                	for(int i = 0; i < vetor.length;i++) {
                		vetor[i] = 0;
                		System.out.print(vetor[i]);
                	};
                    break;
                case 2:
                	
                	System.out.println("insira um valor: ");
                	int insere_valor = kboard.nextInt();
                	for(int i = 0; i < vetor.length;i++) {
                		
                		if(vetor[i] == 0) {
                			vetor[i] = insere_valor;
                			System.out.println(vetor[i]+" "+i);
                			i = vetor.length;
                		} else if(i == vetor.length-1) {
                			System.out.print("Infelizmente o vetor está cheio");
                		};
                	};

                    break;

                case 3:
                		System.out.println("Insira o index do valor que deseja apagar: ");
                		int altera_valor = kboard.nextInt();
                		vetor[altera_valor] = 0;
                    break;
                
                case 4:
                	
                	System.out.println("insira um valor que deseja consultar: ");
                	int consulta_valor = kboard.nextInt();
                	
                	for (int i = 0; i < vetor.length;i++) {
                		if (consulta_valor == vetor[i]) {
                			System.out.println("Valor localizado no index " + i);
                		}else if (i == vetor.length - 1) {
                			System.out.println("O valor informado não foi localizado no vetor.");
                		};       		
                	};
                
                    break;
                
                case 5:
                	
                	
                
                    break;
                
                case 6:
                
                    break;
                
                case 7:
                    break;

                case 8:

                    break;

                case 0:
                    
                	
                	break;
                    
                default:
                    break;
            }
            
        }
        

    }
}