import java.util.*;

class loops {
    public static void main(String[] args) {
        int random = (int) Math.round(Math.random() * 10);
        boolean correct = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(random);
        System.out.println("Input any number");
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            if (input == random) {
                System.out.println("You guessed the correct number!");
                correct = true;
                break;
            } else if (input > random) {
                System.out.println("Try for a smaller number");
            } else if (input < random) {
                System.out.println("Try for a bigger number");
            }
            correct = false;
        }
        if (correct) {
            System.out.println("");
        } else if (!correct) {
            System.out.println("Better try next time");
        }
    }
}
