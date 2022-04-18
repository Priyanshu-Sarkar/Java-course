package exercise;

import java.util.Scanner;

public class qone {
    public static void main(String[] args) {
        // * Finding average of three numbers
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float average = findAverage(a, b, c);
        System.out.println(average);
    }

    public static float findAverage(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        return avg;
    }
}
