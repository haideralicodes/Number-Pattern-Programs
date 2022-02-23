import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = input.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        

    }
}
