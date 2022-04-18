package exercise;

import java.util.Scanner;

public class qfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double c = circumference(radius);
        System.out.println(c);
    }

    public static double circumference(double rad) {
        double circumference = 2 * Math.PI * rad;
        return circumference;
    }
}
