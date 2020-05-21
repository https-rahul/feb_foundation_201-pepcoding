import java.util.*;
import java.math.*;

public class rotate {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //digit to rotate
        int k = scn.nextInt(); //number of rotations to perform

        int nod = 0; //number of digits

        int temp = n;

        while(temp != 0){
            nod++;
            temp /=10;
        }

        int div = (int)Math.pow(10, k); //diviser
        int q = n/div;
        int rem = n%div;
        int mult = (int)Math.pow(10, nod - k);
        int ans = rem * mult + q;
        System.out.println(ans);
    }
}