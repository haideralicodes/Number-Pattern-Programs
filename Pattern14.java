public class Pattern14 {
    public static void main(String[] args) {
    
        int rows = 7;
        
        /*
        
1
11
101
1001
10001
100001
1000001
        
        */
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i ){
                    System.out.print("1"); 
                }
                else{
                    System.out.print("0"); 
                }
            }
            System.out.println(); 
        }
        
    }
}

