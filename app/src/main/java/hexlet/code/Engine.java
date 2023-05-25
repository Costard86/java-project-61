package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void gameRun(String[][] questionsAndAnswers, String exercise) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(exercise);
        var attempts = 0;
        while (attempts < ROUND_COUNT) {
            String question = questionsAndAnswers[attempts][0];
            String correctAnswer = questionsAndAnswers[attempts][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner answerUser = new Scanner(System.in);
            String userAnswer = answerUser.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                attempts++;
            } else {
                System.out.printf('\'' + userAnswer + '\'' + " is wrong answer ;(. Correct answer was "
                        + '\'' + correctAnswer + '\'' + "\nLet's try again, " + name + "!");
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
