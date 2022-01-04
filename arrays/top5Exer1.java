import java.util.Scanner;

public class top5Exer1{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        float grades[] = new float [5];
        int i;
        
        for(i = 0; i< grades.length -1; i++){
            grades[i]= kboard.nextFloat();
            grades[4]= grades[i] + grades[4];
        }
        
        System.out.printf("%.2f \n", grades[4]/i);
        
    }
}