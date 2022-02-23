import java.util.Scanner;

public class Pattern1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = input.nextInt();
                /*
    1
    12
    123
    1234
    12345
                */
        

        for(int i = 1; i<= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}