package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prb1 {
    public static void main(String[] args) {
       
        //Random Value

        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int[2500];
        // Random rd = new Random();

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = rd.nextInt(2);
        // }

        // sum of arrays

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        //}
        // System.out.println(Arrays.toString(arr));
        // System.out.println(sum);


        // number of Zeros&Ones

        // int z_c = 0;
        // int o_c = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == 1) {
        //         o_c++;
        //     }else{
        //         z_c++;
        //     }
        // }
        // System.out.println(o_c);
        // System.out.println(z_c);


        //Find the maximum & minimum value 

        // int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8888, 9, 78, 99999, 10, 256984236};
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < arr1.length; i++) {
        //     if (arr1[i] > max){
        //         max = arr1[i];
        //     }
        //     if (arr1[i]< min) {
        //         min = arr1[i];
        //     }
            
        // }
        // System.out.println(max + " " + min);

        //Find the maximum & minimum value 
        // Sorting method 1

        // int a[] = {1,2,3,-1,2,-3,-4,0};
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));

        //Find the maximum & minimum value 
        
        // Sorting method 2

        int arr[] = {7,5,2,3,8,1,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
