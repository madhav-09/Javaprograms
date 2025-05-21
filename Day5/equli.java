package Day5;

public class equli {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3};
        int t_Sum = 0;
        int l_Sum = 0;
        for (int num : arr) {
            t_Sum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            t_Sum -= arr[i]; 
            if (l_Sum == t_Sum) {
                System.out.println("Equilibrium " + i);
                return;
            }
            l_Sum += arr[i];
        }
        System.out.println("Not found.");
    }
}
