public class Pattern4 {

    // 1 2 3 4 
    // 2 3 4 
    // 3 4 
    // 4 

    public static void main(String[] args) {
        
        int row = 4;

        int num = 1;


        for(int i = 1; i <= row; i++){

            int num2 = num;

            for(int j = 1; j <= row-i+1; j++){

                System.out.print(num2 + " " );
                num2++;
            }
            System.out.println();
            num++;
        }
    }
    
}
