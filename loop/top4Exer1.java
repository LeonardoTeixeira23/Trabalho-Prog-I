package loop;
import java.util.Scanner;

public class top4Exer1 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int priVal, i;

        System.out.println("Insira o valor a ser testado");
        priVal = kboard.nextInt();

        for (i=2;i <= (priVal/2)+1;i++) {
            //testa se o tem divisores alem de 1 e ele mesmo.
            if(priVal%i == 0){
                System.out.println("Não");
                i= (priVal/2)+1;
            }else{
                //verifica se ainda a algum possivel divisor 
                if (i==(priVal/2)+1) {
                    System.out.println("sim");
                }
            }
        }
    }
}
