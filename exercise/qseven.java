package exercise;

import java.util.Scanner;

public class qseven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            int input = s.nextInt();
            if (input < 0) {
                negativeCount += 1;
            } else if (input > 0) {
                positiveCount += 1;
            } else if (input == 0) {
                zeroCount += 1;
            }
        }
        System.out.println("No. of positive numbers = " + positiveCount + "\nNo. of negative numbers = " + negativeCount
                + "\nNo. of zeroes = " + zeroCount);
    }
}
