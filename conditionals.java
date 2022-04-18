import java.util.Scanner;

class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 34;
        int b = sc.nextInt();
        if (b > a) {
            System.out.println(b + " is greater than 34");
        } else {
            System.out.println(b + " is lesser than 34");
        }
    }
}
