import java.util.Scanner;

public class top5Exer2{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        float values[] = new float [10],larger=0, smaller=10;
        int i, indexS=0, indexL=0;

        for(i=0; i < values.length; i++ ){
            values[i]= kboard.nextFloat();
        }

        for (i = 0; i < values.length; i++) {
            
            if(values[i] > larger){
                larger = values[i];
                indexL = i + 1;
            }
            
            if(values[i] <= smaller){
                smaller = values[i];
                indexS = i + 1;
            }
        }

        System.out.printf(indexS + " " + smaller + " " + indexL + " " + larger);
    }
}