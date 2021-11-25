package condicionais;
import java.util.Scanner;

public class top3Exer5 {
    public static void main(String[] args) {
        Scanner kboard= new Scanner (System.in);
 
        int priVal, segVal, terVal;

        System.out.println("Informe os valores: ");
        priVal= kboard.nextInt();
        segVal= kboard.nextInt();
        terVal= kboard.nextInt();

        if (priVal <= 0 || segVal <= 0 || terVal <= 0) {
            System.out.println("-");
        }else{
            if (priVal <= segVal && priVal <= terVal) {
                System.out.println(priVal);
            } else {
                if (segVal <= priVal && segVal <= terVal) {
                    System.out.println(segVal);
                } else {
                    System.err.println(terVal);
                }
            }
            
            
            if ((priVal <= segVal && priVal >= terVal) 
            || (priVal >= segVal && priVal <= terVal) ) {
                System.out.println(priVal);
            } else {
                if((segVal <= priVal && segVal >= terVal) 
                || (segVal >= priVal && segVal <= terVal)){
                    System.out.println(segVal);
                }else {
                    System.out.println(terVal);
                }
            }
            
            
            if (priVal >= segVal && priVal >= terVal) {
                System.out.println(priVal);
            } else {
                if (segVal >= priVal && segVal >= terVal) {
                    System.out.println(segVal);
                } else {
                    System.err.println(terVal);
                }
            }
        }
    }
}

