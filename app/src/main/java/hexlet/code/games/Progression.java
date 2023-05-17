package hexlet.code.games;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        var attempts = 0;
        while (attempts < 3) {
            int startElement = 1 + (int) (Math.random() * 10);
            int step = 1 + (int) (Math.random() * 5);
            var progression = new String[10];

            for (var i = 0; i < 10; i++) {
                progression[i] = Integer.toString(startElement);
                startElement = startElement + step;
            }

            int randomMissElem = (int) (Math.random() * 10);
            var temp = progression[randomMissElem];
            progression[randomMissElem] = "..";
            String masToString = "";
            for (var i = 0; i < 10; i++) {
                masToString = masToString + progression[i] + " ";
            }

            System.out.println("Question: " + masToString + "\nYour answer: ");

            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.nextLine();
            if (userAnswer.equals(temp)) {
                System.out.println("Correct!");
                attempts = attempts + 1;
            } else {
                System.out.println('\'' + userAnswer + '\'' + " is wrong answer ;(. Correct answer was "
                        + temp + "\nLet's try again, " + name + '!');
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
