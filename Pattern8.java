public class Pattern8 {

   public static void main(String[] args) {
    
    int row = 4; 

    int num =  10;

    char ch = 'I';

        for(int i = 1; i <= row; i++){
            char ch1 = ch;
            int num1 = num;

            for(int j = 1; j <= i; j++){

                if(i % 2 == 0){

                    System.out.print(ch1 + " ");
                    ch1--;
                }else{

                    System.out.print(num1 + " ");
                    num1--;
                }
            }
            System.out.println();
            // ch--;ch--;
            // num = num - 2;
            if(i == 1){
                continue;
            }else if(i % 2 == 0){

                ch--;ch--;ch--;
               
            }else{

                num = num - 3;
            }
        }
   } 
    
}
