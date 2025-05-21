package Day7;

import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
        
        // Take string as input and check if it is a palindrome or not
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Word: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome.");
        } 
        else {
            System.out.println("Not a palindrome.");
        }
    }
}
