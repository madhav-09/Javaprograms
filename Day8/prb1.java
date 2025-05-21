package Day8;

import java.util.Arrays;
import java.util.Scanner;

    // Take two strings as input and check if they are anagrams
public class prb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        char[] ch = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        if (Arrays.equals(ch, ch2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
