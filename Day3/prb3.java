package Day3;

public class prb3 {
    public static void main(String[] args) {
        
        // Find the maximum repeated number in Arrays

        int arr[] = {1,1,1,1,2,2,2,2,2,2,1,3,5,3,3,3,3,3,3,6,6,6,6,6,6,6,6,6,6,6,6,6,6,9,9,9,9,8,8,8,5,5,1,1,1};
        int n = arr.length;
        int max = 0;
        int val = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                val = arr[i];
            }
        }

        System.out.println(val + " : " + max);
    }
}
