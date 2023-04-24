public class Pattern5 {

    // 1 2 3 4 
    // 2 3 4 
    // 3 4 
    // 4 

    public static void main(String[] args) {
        

        int row = 4;

        char ch = 'A';

        for(int i = 1; i <= row; i++){

            char ch1 = ch;

            for(int j = 1; j <= row-i+1; j++){

                System.out.print(ch1 + " ");
                ch1++;

            }
            System.out.println();
            ch++;

        }
    }
    
}
