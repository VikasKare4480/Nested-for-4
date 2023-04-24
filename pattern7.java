// import java.util.concurrent.CountDownLatch;

public class pattern7 {

   public static void main(String[] args) {

    // F 
    // E 1 
    // D 2 E 
    // C 3 D 4 
    // B 5 C 6 D 
    // A 7 B 8 C 9 
    
    int row = 6;

    int num = 1; 

    char ch = 'F';

        for(int i = 1; i <= row; i++){

            char ch1 = ch;

            for(int j = 1; j <= i; j++){

                if(j % 2 == 0){

                    System.out.print(num + " ");
                    num++;
                }else{

                    System.out.print(ch1 + " ");
                    ch1++;
                }
            
            }
            ch--;
            System.out.println();
        }
   } 
    
}
