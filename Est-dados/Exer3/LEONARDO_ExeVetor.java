import java.util.Scanner;



public class LEONARDO_ExeVetor{
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        LEONARDOTEIXEIRA_exer2Classe vetor = new LEONARDOTEIXEIRA_exer2Classe(20);
        int key, entrada;
        boolean fim_loop = false;

        while (!fim_loop) {
        	
        	System.out.print("\n[1] criar o vetor vazio ou \"zerar o vetor\"\n"
        			+ "[2] inserir um valor no vetor\n"
        			+ "[3] apagar um valor do vetor\n"
        			+ "[4] consultar se existe determinado valor no vetor\n"
        			+ "[5] consultar quantos valores já ocupam o vetor\n"
        			+ "[6] consultar qual o maior valor armazenado no vetor\n"
        			+ "[7] consultar qual o menor valor armazenado no vetor\n"
        			+ "[8] apresentar uma listagem dos valores armazenados no vetor\n"
        			+ "[0] sair do programa\n"
        			+ "Escolha uma opção: ");
        	
        	key = kboard.nextInt();
        	
            switch (key) {
                case 1:    
                	
                	vetor.zera();
                	
                    break;
                case 2:
                	System.out.print("\ninsira um valor: ");
                	entrada = kboard.nextInt();
                	
                	vetor.insere(vetor.testaPosivtivo(entrada));

                    break;

                case 3:
                	
                	System.out.print("\nInsira o index do valor que deseja apagar: ");
            		entrada = kboard.nextInt();
                	
                	vetor.excluir(entrada);
                	
                    break;
                
                case 4:
                	
                	System.out.println("insira um valor que deseja consultar: ");

                	entrada = kboard.nextInt();
                	vetor.procuraValor(entrada);
                
                    break;

                case 5:
                	
                	vetor.qtdValoresVetor();
                	
                    break;
                
                case 6:
                	
                	vetor.maior();
                	
                    break;
                
                case 7:
                	
                	vetor.menor();
                	
                	break;

                case 8:
                	
                	vetor.listaValores();
                	
                    break;

                case 0:
                    
                	fim_loop = true;
                	
                	break;
            }
            
        }
        

    }
}
