package questions;

import java.util.Scanner;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class q4 {
    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference: " + getCircumference(r));
    }
}
