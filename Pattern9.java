// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Pattern9 {
    public static void main(String[] args) {
        
        /**
            7654321
            765432
            76543
            7654
            765
            76
            7
         */

        int rows = 7;
        for(int i = 0; i < rows; i++){
            for(int j = 7; j > 0+i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}