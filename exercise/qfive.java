package exercise;

import java.util.Scanner;

public class qfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        votingEligibility(age);
    }

    public static void votingEligibility(int age) {
        if (age < 0) {
            System.out.println("Please input a valid age");
        } else if (age >= 18) {
            System.out.println("You are eligilble for voting");
        } else if (age < 18) {
            System.out.println("You are not eligible for voting");
        }
    }
}
