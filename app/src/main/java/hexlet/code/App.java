package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice:");
        Scanner scan = new Scanner(System.in);
        int numberGame = scan.nextInt();
        switch (numberGame) {
            case 1 -> {
                System.out.println("Welcome to the Brain Games!");
                Cli.greet();
            }
            case 2 -> Even.even();
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice, please try again!");
        }
    }
}
