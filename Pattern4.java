import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = input.nextInt();

        //  1
        //  22
        //  333
        //  4444
        //  55555
        //  666666

        for(int i = 1; i <= rows; i++){
            for(int j = 1; i <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
