package condicionais;
import java.util.Scanner;

public class top3Exer4 {
    public static void main(String[] args) {
        Scanner kboard= new Scanner (System.in);
 
        int priVal, segVal, terVal;

        System.out.println("Informe os valores: ");
        priVal= kboard.nextInt();
        segVal= kboard.nextInt();
        terVal= kboard.nextInt();

        if (priVal <= 0 || segVal <= 0 || terVal <= 0) {
            System.out.println("invalido");
        } else {
            if((segVal - terVal < priVal && priVal < segVal + terVal) 
            && (priVal - segVal < terVal && terVal < priVal + segVal)
            && (priVal - terVal < segVal && segVal < terVal + priVal ))  { 
                System.out.println("sim");
            }else{
                System.out.println("não");
            }
        }
    }
}

