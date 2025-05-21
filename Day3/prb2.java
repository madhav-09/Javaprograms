package Day3;

import java.util.Arrays;
import java.util.Random;

public class prb2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Generated Array: " + Arrays.toString(arr));

        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
