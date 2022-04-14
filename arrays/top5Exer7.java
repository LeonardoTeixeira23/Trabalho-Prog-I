import java.util.Scanner;

public class top5Exer7{
    public static void main (String[] args){
        Scanner kboard = new Scanner(System.in);

        int value[]= new int[3], i;

        value[0] = kboard.nextInt();
        value[1] = kboard.nextInt();

        for(i = 0, value[2] = kboard.nextInt(); value[2] != 0; value[2]= kboard.nextInt() ){
            
            if (value[2] <= value[1] && value[2] >= value[0] ) {
                i++;
            }
        }

        System.out.println(i);

    }
}