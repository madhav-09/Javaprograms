package Day7;

import java.util.Scanner;

public class prb2 {
    public static void main(String[] args) {
        // Arrange string in alphabetical order 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = sc.nextLine();  

        char[] ch = str.toCharArray();

        char temp;
        
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.print("Sorted String: ");

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
