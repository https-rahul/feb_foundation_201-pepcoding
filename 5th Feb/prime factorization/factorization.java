import java.util.*;
import java.math.*;

public class factorization {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int temp = num;

        for (int div = 2; div * div <= temp; div++) {

            while (temp % div == 0) {
                temp = temp / div;
                System.out.print(div + " ");
            }
        }
        System.out.println();

    }
}