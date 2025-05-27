package questions;

import java.util.*;

// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. x^n.

public class q7 {
    public static int power(int x, int n) {
        int result = 1;
        for(int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("Enter n");
        int n = sc.nextInt();

        int result = power(x, n);
        System.out.println("x to the power n is : " + result);
    }
}
