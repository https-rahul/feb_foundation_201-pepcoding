/* num = 5
        *
       **
      ***
     ****
    *****   */

import java.util.*;

public class pattern3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=num-1; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=i; k<=num; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}