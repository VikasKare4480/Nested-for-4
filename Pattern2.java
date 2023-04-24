public class Pattern2 {

// 1 
// 3 4 
// 6 7 8 
// 10 11 12 13 

    

   public static void main(String[] args) {

    int num = 1;
    int row = 4;
    
    for(int i = 1; i <= row; i++ ){


        for(int j = 1; j <= i; j++){

            System.out.print(num + " ");
            num++;

        }
        num++;
        System.out.println();
    }
   } 
    
}
