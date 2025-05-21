package Day10;

import java.util.Scanner;

// Create a chess board using 2D array.

public class prb1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the chess board: ");
        int n = sc.nextInt();

        String[][] board = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "B";
                } else {
                    board[i][j] = "W";
                }
            }
        }

        System.out.println("Chess Board (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
