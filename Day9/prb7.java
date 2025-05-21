package Day9;

import java.util.Scanner;

// Find target element in 2D array (manual method)

public class prb7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

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

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int found = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target element " + target + " found at row " + i + " and column " + j);
                    found = 1;
                }
            }
        }

        if (found == 0) {
            System.out.println("Target element " + target + " not found in the array.");
        }
    }
}
