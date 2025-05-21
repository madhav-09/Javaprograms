package Day9;

import java.util.Scanner;

// Find the sum of left and right diagonal

public class prb6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        if (n != m) {
            System.out.println("Diagonal sums are only applicable for square matrices.");
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
        int rightDiagonalSum = 0;

        System.out.print("Left Diagonal Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
            leftDiagonalSum += arr[i][i];
        }

        System.out.println("\nLeft Diagonal Sum: " + leftDiagonalSum);

        System.out.print("Right Diagonal Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + " ");
            rightDiagonalSum += arr[i][n - 1 - i];
        }
        System.out.println("\nRight Diagonal Sum: " + rightDiagonalSum);
    }
}
