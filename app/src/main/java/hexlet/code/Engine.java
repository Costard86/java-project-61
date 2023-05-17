package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String name;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static String game(String answer, String correctAnswer) {
        System.out.println("Question: " + answer + "\nYour answer: ");
        Scanner answerToUser = new Scanner(System.in);
        String userAnswer = answerToUser.nextLine();
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return "Correct!";
        } else {
            return ('\'' + userAnswer + '\'' + " is wrong answer ;(. Correct answer was " + '\'' + correctAnswer + '\''
                + "\nLet's try again, " + name + '!');
        }
    }
}
