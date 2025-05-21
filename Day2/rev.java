package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class rev {
    public static void main(String[] args) {
        // int arr[] = {7, 8, 7, 5, 6, 3, 2};
        // int n = arr.length;

        // Just for reverse print
        // for(int i = n - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }

        //Changing the index with reverse order
        
        // int arr[] = {7, 8, 7, 5, 6, 3, 2};
        // int n = arr.length;
        // int arr1[] = new int[n];
        // int index = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     arr1[index] = arr[i];
        //     index++;
        //     System.out.println(Arrays.toString(arr1));
        // }

        // for (int i : arr1) {
        //     System.out.print(i + " ");
        // }

        // Changing the index with reverse order
        
        //Method 2 swaping num

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        int start = 0; 
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            System.out.println(Arrays.toString(arr));
        }

    }
}
