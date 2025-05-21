package Day2;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
        // String str[] = new String[10];
        // str[0] = "Srinath";
        // str[5] = "Jino";
        // str[8] = "Kanu";
        // str[9] = "Manju";
        // str[0] = "Arjun";
        // System.out.println(str[0]);
        // // for(int i=0;i<str.length;i++){
        // //     System.out.print(str[i]+" ");
        // // }

        // for(String s:str) {
        //     System.out.println(s + "" );
        // }


         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
        // int arr[] = new int[size];
        // for(int i=0;i<size;i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }


        // char arr[] = new char[size];
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.next().charAt(0);
        // }
        // for (char c : arr) {
        //     System.out.print(c + " ");
        // }


        String s[] = new String[size];
        for (int i=0;i<size;i++) {
            s[i] = sc.nextLine();
        }
        for(int i=0;i<size;i++) {
            System.out.println(s[i]+"");
        }


    }
}
