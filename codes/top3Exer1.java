import java.util.Scanner;

public class top3Exer1{
    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);

        int valor;

        System.out.println("digite o valor: ");
        valor= kboard.nextInt();
        
        if (valor > 100) {
            System.out.println(valor+ " Sim");            
        } else {
            System.out.println(valor+ " não");
        }

    }
}