import java.util.Scanner;

public class top3Exer6 {
   
    public static void main(String[] args) {
        Scanner kboard= new Scanner (System.in);
 
        int priVal, segVal;

        System.out.println("Informe os valores: ");
        priVal= kboard.nextInt();
        segVal= kboard.nextInt();

        if (priVal < 0 || segVal < 0 ) {
            System.out.println("-");
        } else {
            
            if (priVal >= segVal) {
                System.out.println((24 - priVal) + segVal);
            } else {
                System.out.println(segVal-priVal);
            }
    
        }

    }
}