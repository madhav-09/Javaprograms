package questions;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class q3 {
     public static int getGreater(int a, int b) {
      if(a > b) {
          return a;
      } else {
          return b;
      }
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(getGreater(a, b));
   } 
}
