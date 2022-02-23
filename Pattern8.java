// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern8 {
    public static void main(String[] args) {
        
        
        //  1           i =1  1
        //  22          i =2  22
        //  333         i =3  333
        //  4444        i =4  4444
        //  55555       i =5  555555
        //  666666      i =6  6666666
    
        int rows =5;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }       
    }
}