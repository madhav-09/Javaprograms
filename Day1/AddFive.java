package Day1;
public class AddFive {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;

        while (n != 0) {
            int r = n%10;
            sum = sum + r;
            n = n/10 ;
            System.out.println(n+ "");
        }
        System.out.println("The sum is: " + sum);
    }
    
}
