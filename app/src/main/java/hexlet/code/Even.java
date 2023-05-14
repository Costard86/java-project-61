package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void even() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var attempts = 0;
        while (attempts < 3) {
            int random = 1 + (int) (Math.random() * 20);
            var correctAnswer = "";
            if (random % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Question: " + random + "\nYour answer: ");
            Scanner noYes = new Scanner(System.in);
            String yesNo = noYes.nextLine();
            if (yesNo.equals(correctAnswer)) {
                System.out.println("Correct!");
                attempts = attempts + 1;
            } else {
                System.out.println('\'' + yesNo + '\'' + " is wrong answer ;(. Correct answer was " + '\''
                        + correctAnswer + '\'' + "\nLet's try again, " + name + '!');
                break;
            }

        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
