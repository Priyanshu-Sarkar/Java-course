import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long factorial = returnFactorial(n);
        // switch (factorial) {
        // case -1:
        // System.out.println("Please input a positive number");
        // break;
        // default:
        // System.out.println(factorial);
        // }
        System.out.println(factorial);
    }

    public static long returnFactorial(long n) {
        // if (n < 0) {
        // return -1;
        // }
        long factorial = 1;
        for (long i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
