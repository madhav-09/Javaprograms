package Pattern;

import java.util.Scanner;

public class palindnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of ROWS: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        System.out.println(" ");
        }
    }
}
