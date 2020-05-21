/*bulbs with even number of factors are OFF,
bulbs with odd number of factors are ON

perfect squares are ON

Count the number of factors for each bulb to determine how many bulbs will remain ON after nth fluctuations.

Eg, n=25
    1 4 9 16 25 number bulbs will remain ON provided all were OFF at the beginning*/

import java.util.*;

public class banjamin {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int temp = (int) Math.sqrt(num);
        
        for(int i=1; i<=temp; i++){
            System.out.print(i*i +" ");
            
        }
    }
}