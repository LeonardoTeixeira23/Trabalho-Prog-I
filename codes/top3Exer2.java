package codes;
import java.util.Scanner;

public class top3Exer2 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor: ");
        valor= kboard.nextInt();
        
        if ((valor%2) != 0 ) {
            System.out.println(valor+ " impar");
        } else {
            System.out.println(valor+ " par");
        }
    }
}
