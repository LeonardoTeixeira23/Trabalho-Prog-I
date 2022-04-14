package loop;
import java.util.Scanner;

public class top4Exer5 {
    public static void main(String[] args){
        Scanner kboard = new Scanner(System.in);

        int priVal, i;
        
        System.out.println("Informe um valor");
        //testa se o numero é diferente de zero
        for( priVal = 1, i = 0;priVal != 0; ){
            //captura novo numero
            priVal= kboard.nextInt();
            //verifica se esta no intervalo    
            if (priVal >= 100 && priVal <= 200) {
                i++;
            }
        }
        //exibe o resultado
        System.out.println(i);
    }
}
