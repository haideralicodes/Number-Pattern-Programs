public class Pattern15 {
    public static void main(String[] args) {
    
        int rows = 7;
        
        /*
        
1
11
1 1
1  1
1   1
1    1
1111111
        
        */
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i || i == rows){
                    System.out.print("1"); 
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
        
    }
}
