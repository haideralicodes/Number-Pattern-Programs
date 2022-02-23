import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = input.nextInt();


        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <=rows-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
