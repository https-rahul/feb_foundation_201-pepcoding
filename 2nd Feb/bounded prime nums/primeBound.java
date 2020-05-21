//java program to print all the prime numbers in the given bound

import java.util.*;

class primeBound {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i=low; i<=high; i++){
            int factorial = 0;
                for(int j=2; j*j<=i; j++){
                    if(i%j==0){
                        factorial++;
                        break;
                    }
                    if(factorial==0)
                        System.out.println(i);
                }
        }
    }
}