package hexlet.code;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        var attempts = 0;
        while (attempts < 3) {
            int randomNumb1 = 1 + (int) (Math.random() * 20);
            int randomNumb2 = 1 + (int) (Math.random() * 20);
            char[] operators = {'+', '-', '*'};
            int randomOperator = (int) (Math.random() * 3);
            char operator = operators[randomOperator];
 //           int correctAnswer = 0;

            int correctAnswer = switch (operator) {
                case '+' -> randomNumb1 + randomNumb2;
                case '-' -> randomNumb1 - randomNumb2;
                case '*' -> randomNumb1 * randomNumb2;
                default -> {
                    System.out.println("null");
                    yield 0;
                }
            };

            System.out.println("Question: " + randomNumb1 + operator + randomNumb2 + "\nYour answer: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number == correctAnswer) {
                System.out.println("Correct!");
                attempts = attempts + 1;
            } else {
                System.out.println('\'' + Integer.toString(number) + '\'' + " is wrong answer ;(. Correct answer was "
                        + '\'' + correctAnswer + '\'' + "\nLet's try again, " + name + '!');
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
