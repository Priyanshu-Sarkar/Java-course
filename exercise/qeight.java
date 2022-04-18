package exercise;

import java.util.Scanner;

public class qeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent/power: ");
        double power = sc.nextDouble();
        double expo = exp(base, power);
        System.out.println(expo);
    }

    public static double exp(double x, double n) {
        double number = 1;
        for (int i = 1; i <= n; i++) {
            number *= x;
        }
        return number;
    }
}
