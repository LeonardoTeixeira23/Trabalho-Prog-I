package loop;
import java.util.Scanner;

public class top4Exer4 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int priVal,segVal, a, b, exibe, i;

        a = 0;
        b = 1;

        System.out.println("Insira os valor iniciais");
        priVal = kboard.nextInt();
        segVal= kboard.nextInt();
        
        if(priVal == 0){ 
        
            System.out.println("0 1 ");
        
        }
        
        for ( i=segVal, exibe = 0; exibe <= i;a = b, b = exibe) {
            //soma o proximo valore de fibonacci 
            exibe = a + b;
            //exibe o resultado
            if(exibe >= priVal && exibe <= segVal ){
                System.out.print(exibe + " ");
            }
        }
    }
}
