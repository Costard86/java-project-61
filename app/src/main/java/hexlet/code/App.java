package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner scan = new Scanner(System.in);
        int numberGame = scan.nextInt();
        switch (numberGame) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greet();
            break;
            case 0:
            break;
        }
    }
}
