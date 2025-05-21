package Day4;
// printing array using sum of given array 
import java.util.Arrays;

public class prb1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 1000};
        int sum = 0;
        for (int num:arr) {
            sum += num;
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
