import java.util.Scanner;

public class top5Exer5{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        int fibonacci[] = new int[31], i, start, end, indexS=0, indexE=0;
        fibonacci[0] = 0;
        fibonacci[1]= 1;

        start = kboard.nextInt();
        end = kboard.nextInt();

        for(i = 1; i < fibonacci.length-1; i++){
            fibonacci[i+1] = fibonacci[i]+fibonacci[i-1];
        
        }

        if (end >= fibonacci[30] || start > end) {

            System.out.println("erro");
        }else{
                    
            for(i=0; i < fibonacci.length; i++){
                
                if (fibonacci[i] >= start && fibonacci[i] <= end) {
                    System.out.print(fibonacci[i] + " ");
                    indexE = i;
                }
            }

            if (start == 0) {
                indexS = 0;

            }else{
                
                for ( i = indexE;fibonacci[i] > 0; i-=1) {
                    if (fibonacci[i] >= start) {
                        indexS = i;
                    }
                }
            }

            if (indexE == 0) {
                System.out.println("-");

            } else {
                System.out.println(indexS+"-"+indexE);
                
            }
        }
    }
}