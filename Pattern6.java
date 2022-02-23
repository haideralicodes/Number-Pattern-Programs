public class Pattern6 {

    public static void main(String[] args) {
    /*
    1
    12
    123
    1234
    12345
    */
    
    for(int i = 1; i<= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
    }
}

