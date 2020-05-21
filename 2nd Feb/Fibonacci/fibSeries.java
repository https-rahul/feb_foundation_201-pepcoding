import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class fibSeries {
    
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());

        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=0; i<n-2; i++){
            int sum = a+b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
