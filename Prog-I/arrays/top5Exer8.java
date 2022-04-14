import java.util.Scanner;

public class top5Exer8{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);

        int values[]= new int[5], i;


        for(values[0]= kboard.nextInt(); values[0] != 0; values[0]= kboard.nextInt() ){
            if(values[0] !=0){
                if (values[0] > 0) {
                    values[1]++;
                }
                
                if (values[0] < 0) {
                    values[2]++;
                }
                
                if (values[0]%2 == 0) {
                    values[3]++;
                }
                
                if (values[0]%2 != 0) {
                    values[4]++;
                }
        
            }
        }
        for(i = 1; i < values.length; i++ ){
           System.out.println(values[i] + " - ");
        
        }
    }
}