package Pattern;

import java.util.Scanner;

public class SolidRom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print(" ");
            }
            for ( int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
