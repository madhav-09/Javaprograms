package Day8;

import java.util.Scanner;

public class prb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            result.append(reversed).append(" ");
        }

        System.out.println("Output: " + result.toString().trim());

        sc.close();
    }
}
