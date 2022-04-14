import java.util.Scanner;

public class top5Exer3{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);
        
        int nVectors = kboard.nextInt(), i;
        float grades[] = new float[nVectors], approved=0,total=0, mean;

        for(i = 0; i < grades.length; i++){
            
            grades[i] = kboard.nextFloat();
            total = grades[i] + total; 
        }

        mean= total/nVectors;

        for(i = 0; i < grades.length; i++){
            
            if(grades[i] > mean){
                approved++;
            }
        }
        
        System.out.printf("%.1f%s\n", ((approved/nVectors)*100), "%" );
    }
}