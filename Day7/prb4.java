package Day7;

import java.util.Scanner;

public class prb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Helshlo,World,Java";
        
        System.out.print("Enter a character to find in the string: ");
        char c = scanner.next().charAt(0);
        
        int index = str.indexOf(c);
        
        if (index != -1) {
            System.out.println("Substring before the character: " + str.substring(0, index));
            System.out.println("Substring after the character: " + str.substring(index, str.length()));
        } else {
            System.out.println("Character not found in the string.");
        }
        
        scanner.close();
    }
}

