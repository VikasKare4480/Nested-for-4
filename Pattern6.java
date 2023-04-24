public class Pattern6 {

    // 1 
    // 2 3 
    // 3 4 5 
    // 4 5 6 7 
    
   public static void main(String[] args) {

    int row = 4;
    int num = 1;

    for(int i = 1; i <= row; i++){

        int num1 = num;
        
        for(int j = 1; j <= i; j++){

            System.out.print(num1 + " ");
            num1++;

        }
        num++;
        System.out.println();
    }
   }
    
}
