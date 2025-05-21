package Day7;

import java.util.Scanner;

public class prb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        
        int specialCount = str.length() - str.replaceAll("[^a-zA-Z0-9]", "").length();
        
        String modifiedStr = str.replaceAll("[AEIOUaeiou]", " ");
        
        System.out.println("Modified String: " + modifiedStr);
        System.out.println("Special characters count: " + specialCount);
        
    }
}