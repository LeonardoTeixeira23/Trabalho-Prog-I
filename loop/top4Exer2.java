package loop;
import java.util.Scanner;

public class top4Exer2 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int priVal,segVal, exibe, i;

        System.out.println("Insira os valor iniciais");
        priVal = kboard.nextInt();
        segVal= kboard.nextInt();
        
        System.out.print(priVal + " " + segVal );
        
        for (i=3;i <= 10;i++) {
            //calcula proximo valor de fibonacci 
            exibe= priVal + segVal;
            //exibe o valor
            System.out.print(" " + exibe);
            //atribui os novos valores as variaveis 
            priVal = segVal;
            segVal = exibe;
        }
    }
}
