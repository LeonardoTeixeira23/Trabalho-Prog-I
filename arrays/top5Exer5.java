import java.util.Scanner;

public class top5Exer5{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        int fibonacci[] = new int[30], i, inicio, fim, indexI, indexF;
        fibonacci[0] = 0;
        fibonacci[1]= 1;

        inicio = kboard.nextInt();
        fim = kboard.nextInt();

        for(i = 1; i < fibonacci.length-1; i++){
            fibonacci[i+1] = fibonacci[i]+fibonacci[i-1];
        }

        for(i=0; i < fibonacci.length; i++){
            if (fibonacci[i] >= inicio && fibonacci[i] <= fim) {
                System.out.print(fibonacci[i] + " ");
            
            }
        }    
    }
}