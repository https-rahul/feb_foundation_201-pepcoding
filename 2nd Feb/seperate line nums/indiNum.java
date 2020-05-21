import java.util.*;

public class indiNum {

    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();

        int digits = digits(num);

        int div = 1;
        for(int i=1; i<= digits; i++){
            div = div*10;
        }

        while(div>0){
            int rem = num%div;
            int quo = num/div;
            System.out.println(quo);
            div /=10;
            num = rem;
        }
        
    }

    public static int digits(int n){
        
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
        
    }
}