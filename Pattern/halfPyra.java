package Pattern;

import java.util.Scanner;

public class halfPyra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO of rows:");
        int n = sc.nextInt();
        
        // for( int i = 1; i <= n; i++){
        //     for( int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }

        // inverted 
        // for( int i = n; i >= 1; i--){
        //     for( int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }    
        
        //     System.out.println(" ");
        // }

        //inverted 180 (right side)

        for( int i = 1; i <= n; i++){
            for ( int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for ( int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
