package questions;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int avg = average(a, b, c);
        System.out.println("Average: " + avg);
    }

    public static int average(int x, int y, int z) {
        return (x + y + z) / 3;
    }
}
