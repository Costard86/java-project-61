package hexlet.code.games;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        var attempts = 0;
        while (attempts < 3) {
            int number = 1 + (int) (Math.random() * 100);
            String correctAnswer = "yes";
            if (number < 2) {
                correctAnswer = "no";
            }
            var divider = 2;
            while (divider <= number / 2) {
                if (number % divider == 0) {
                    correctAnswer = "no";
                }
                divider++;
            }
            var strNumber = Integer.toString(number);
            System.out.println("Question: " + strNumber + "\nYour answer: ");

            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                attempts = attempts + 1;
            } else {
                System.out.println('\'' + userAnswer + '\'' + " is wrong answer ;(. Correct answer was "
                        + '\'' + correctAnswer + '\'' + "\nLet's try again, " + name + '!');
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
