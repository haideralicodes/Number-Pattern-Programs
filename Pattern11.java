public class Pattern11 {
    public static void main(String[] args) {
        
        /*
        7 6 5 4 3 2 1
        6 5 4 3 2 1
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
        */
        
        int rows =7;
        for(int i =0; i < rows; i++){
            for(int j = rows-i; j > 0; j--){
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}
