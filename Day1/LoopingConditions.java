package Day1;
import java.util.*;

class LoopingConditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); 
        char c = sc.next().charAt(0); 

        String s = "Hello World";

        System.out.println(c);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println(s.charAt(i));
            }
        }
    }
}

