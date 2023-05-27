package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD");
        System.out.print("5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        Scanner numGame = new Scanner(System.in);
        String numberGame = numGame.nextLine();
        switch (numberGame) {
            case "1" -> Cli.greet();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> GCD.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice, please try again!");
        }
    }
}
