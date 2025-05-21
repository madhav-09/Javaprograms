package Day9;

import java.util.Scanner;

// Find the sum of right diagonal

public class prb5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        if (n != m) {
            System.out.println("Right diagonal sum is only applicable for square matrices.");
            return;
        }

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        int rightDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            rightDiagonalSum += arr[i][n - 1 - i];
        }

        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
        sc.close();
    }
}
