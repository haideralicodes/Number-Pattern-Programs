public class Pattern7 {
    public static void main(String[] args) {
        
        
        /*
1
12
123
1234
12345
1234
123
12
1
        */
        
        int rows = 5;
        for(int  i=0; i <rows; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
        
            System.out.println();
        }
        
        for(int  i=0; i <rows; i++){
        for(int j = 1; j <= rows-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

