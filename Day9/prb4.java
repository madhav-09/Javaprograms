package Day9;

import java.util.Scanner;

// Find the sum of left diagonal

public class prb4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        if (n != m) {
            System.out.println("Left diagonal sum is only applicable for square matrices.");
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

        int leftDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            leftDiagonalSum += arr[i][i];
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
    }
}
