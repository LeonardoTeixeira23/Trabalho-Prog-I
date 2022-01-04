import java.util.Scanner;

public class top3Exer3 {
    public static void main(String[] args) {
        Scanner kboard= new Scanner (System.in);
 
        int priVal, segVal;

        System.out.println("Informe os valores: ");
        priVal= kboard.nextInt();
        segVal= kboard.nextInt();

        if (priVal <= 0 || segVal <= 0) {
            System.out.println("invalido");
        } else {
            if (priVal > segVal) {
                System.out.println("Primeiro");            
            } else {
                if (segVal > priVal) {
                    System.out.println("segundo");
                } else {
                    System.out.println("iguais");
                }
            }
        }
        kboard.close();
    }
}
