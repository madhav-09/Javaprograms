package Day4;
// printing largest digit from in array from firs three then three excuding first value same for next values in array

// Replacing each element in every group of 3 with the largest value,
// skipping the first element in the first group only. Handles last two separately.

import java.util.Arrays;


public class prb2 {
    public static void main(String[] args) {
        int arr[] = {5, 5, 2, 16, 16, 16, 16, 16, 16, 9, 9};
        int n = arr.length;
        for (int i = 0; i < n-2; i++){
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i+3; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        } 
        if (arr[n - 2] > arr[n - 1]) {
            arr[n - 2] = arr[n - 2];
        }
        else {
            arr[n - 2] = arr[n - 1];
        }
        System.out.println(Arrays.toString(arr)); 
    }
}


