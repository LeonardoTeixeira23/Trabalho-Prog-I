import java.io.Console;
import java.util.Scanner;

public class top5Exer6 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        int values[] = new int[10],i, e=0, valuein;

        for(i = 0; i < values.length; i++){
            
            valuein = kboard.nextInt();

            if(valuein==0){
                values[i]= 0;
                e=i;      
                i = values.length; 
            
            }else{
                for(e = 0; e <= i; e++ ){
                
                    if(values[e] == valuein && e != i  ){
                        i--;
                        e = i;
                    }else{
                        values[i] = valuein;
                    }
                }
            }
        }
        for (i = 0; i <= e; i++ ){
            System.out.print(values[i] + " ");
        }
    }
}
