import java.util.Scanner;

public class top3Exer7 {
    public static void main(String[] args) {
        Scanner kboard= new Scanner (System.in);
 
        int h1, m1, h2, m2, hj, mj;

        System.out.println("Informe os valores: ");
        h1= kboard.nextInt();
        m1= kboard.nextInt();
        h2= kboard.nextInt();
        m2= kboard.nextInt();

        //Verifica se a hora é valida
        if (h1 < 0 || h2 < 0 || m1 < 0 || m2 < 0 ) {
            System.out.println("-");
        } else {
        //Calcula as horas jogadas    
            if (h1 >= h2) {
                hj= (24 - h1) + h2;
            } else {
                hj= h2 - h1;
            }
        //Calcula os minutos jogados
            if (m1 >= m2) {
                mj= (60 - m1) + m2;
                hj--;              
            } else {
                mj= m2 - m1;
            } 
        //Verifica se os minutos podem somar uma hora
            if (mj == 60) {
                mj= 0;
                hj++;
            }
        //Exibe o resultado
            if (mj==0) {
                System.out.println(hj+":"+mj+mj);
                
            } else {
                System.out.println(hj+":"+mj);
            }    
            
        }

    }
}