public class Pattern3 {

    // 10 
    // 10 9 
    // 9 8 7 
    // 7 6 5 4 
   public static void main(String[] args) {
    int row = 4;
    int num = 10;
    
    for(int i = 1; i <= row; i++){

        for(int j = 1; j <= i; j++){

            System.out.print(num + " ");
            num--;

        }
        num++;
        System.out.println();
    }
   } 
    
}
