import java.util.Scanner;

public class top5Exer4{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        int fibonacci[] = new int[10], i;
        fibonacci[0] = 0;
        fibonacci[1]= 1;

        for(i = 1; i < fibonacci.length-1; i++){
            fibonacci[i+1] = fibonacci[i]+fibonacci[i-1];
        }

        for(i=0; i < fibonacci.length; i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
}