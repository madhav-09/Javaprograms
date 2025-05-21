package Day9;

import java.util.Scanner;

// Print rows into cols and cols to rows (Transpose a 2D array)

public class prb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int sum = 0;

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);

        System.out.println("Transpose of the 2D array (rows to cols):");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
