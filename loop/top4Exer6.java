package loop;
import java.util.Scanner;

public class top4Exer6 {
    public static void main(String[] args) {
        
        Scanner kboard= new Scanner(System.in);

        int altu1, cresc1, altu2, cresc2, difAltu, anos ;

        System.out.println("Informe os valores:");

        altu1 = kboard.nextInt();
        cresc1 = kboard.nextInt();
        altu2 = kboard.nextInt();
        cresc2 = kboard.nextInt();
        //verifica se a arvore menor pode passar a maior
        if (altu1 < altu2 && cresc1 <= cresc2 ||
            altu2 < altu1 && cresc2 <= cresc1 ||
            altu1 == altu2 && cresc1 == cresc2) {
            
                System.out.println("nunca");
        
            } else {
                //calcula quanto tempo a arvore 1 demorara caso seja a menor
                if (cresc1 > cresc2) {
                    
                    difAltu= altu2 - altu1;
                    anos= difAltu/(cresc1 - cresc2);
                    System.out.println(anos+1);
                }
                //calcula quanto tempo a arvore 2 demorara caso seja a menor
                if (cresc2 > cresc1) {
                    
                    difAltu = altu1 - altu2;
                    anos= difAltu/(cresc2 - cresc1);
                    System.out.println(anos+1);
                }
        }

    }
}