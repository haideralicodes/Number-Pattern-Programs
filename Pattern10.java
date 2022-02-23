public class Pattern10 {
    public static void main(String[] args) {
        
        int rows =7;
        /*
        1234567
        123456
        12345
        1234
        123
        12
        1
        */
        
        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= rows-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

