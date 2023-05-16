package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n"
                + "5 - Progression\n0 - Exit\nYour choice:");
        Scanner scan = new Scanner(System.in);
        int numberGame = scan.nextInt();
        switch (numberGame) {
            case 1 -> Cli.greet();
            case 2 -> Even.even();
            case 3 -> Calc.calc();
            case 4 -> GCD.gcd();
            case 5 -> Progression.progression();
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice, please try again!");
        }
    }
}
