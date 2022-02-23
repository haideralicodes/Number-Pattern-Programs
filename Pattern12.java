public class Pattern12 {
    public static void main(String[] args) {
        
        int rows =7;
        
        /*
        
        7
        7 6 
        7 6 5
        7 6 5 4
        7 6 5 4 3
        7 6 5 4 3 2 
        7 6 5 4 3 2 1
        
        */
        
        for(int i = 0; i < rows; i++){
            for(int j = 7; j >= rows-i; j--){
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }
}
