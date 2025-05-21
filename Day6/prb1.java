package Day6;

public class prb1 {
    public static void main(String[] args) {

        // length() method returns the number of characters in the string      
        // String str = "aditya";
        // System.out.println(str.length());

        // indexOf() method returns the index of the first occurrence of the specified character
        // System.out.println(str.indexOf('a'));

        // compareTo() compares two strings lexicographically
        // String s = "aA#BDE";
        // String s2 = "aBE";
        // System.out.println(s.compareTo(s2));

        // contains() checks whether a specific sequence of characters is present in the string
        // String s = "Srinath Joker";
        // System.out.println(s.contains("sru"));

        // charAt() returns the character at the specified index
        // System.out.println(s.charAt(3));

        // substring(start, end) returns the substring from start index to (end - 1) index
        // System.out.println(s.substring(8, 12));

        // take input as a string (name) and find all possible substrings of it
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("Give string: ");
        // String input = sc.nextLine(); 
        // System.out.println("All possible substrings:");
        // for (int i = 0; i < input.length(); i++) {
        //     for (int j = i + 1; j <= input.length(); j++) {
        //        System.out.println(input.substring(i, j)); 
        //     }
        // }

        // remove special characters from a string
        // String s = "Sri$@$%nat$h$%^";
        // String rem = s.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(rem);

        // 

        String s = "Srinath";
        String s1 = new String("Srinath");

        System.out.println(s==s1);
        System.out.println(s.equals(s1  
        ));
    }
}
