import java.util.*;

class isPrime{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int factor = 0;

        for(int i=2; i*i<=n; i++){
            if(n % i == 0)
                factor++;
        }
        if(factor == 0)
            System.out.print("is prime");
        
        else
            System.out.print("not prime");
    }
}