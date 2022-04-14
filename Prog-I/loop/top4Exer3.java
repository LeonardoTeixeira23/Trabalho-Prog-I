package loop;
import java.util.Scanner;

public class top4Exer3 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int priVal, i, testeNumPerf;

        testeNumPerf = 0;

        System.out.println("Insira os valor iniciais");
        priVal = kboard.nextInt();
        
        for ( i= 1; i <= priVal/2 ; i++ ) {

            if ((priVal%i) == 0) {
                testeNumPerf += i;
            }    
        }
        if (testeNumPerf == priVal) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
