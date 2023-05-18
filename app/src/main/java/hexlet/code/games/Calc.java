package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    private static final int ROUND_COUNT = 3;
    private static final int RANDOM_NUMBER = 20;
    private static final int RANDOM_OPERATOR = 3;
    public static void calc() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        var attempts = 0;
        while (attempts < ROUND_COUNT) {
            int randomNumb1 = 1 + (int) (Math.random() * RANDOM_NUMBER);
            int randomNumb2 = 1 + (int) (Math.random() * RANDOM_NUMBER);
            char[] operators = {'+', '-', '*'};
            int randomOperator = (int) (Math.random() * RANDOM_OPERATOR);
            char operator = operators[randomOperator];

            int resultCalc = switch (operator) {
                case '+' -> randomNumb1 + randomNumb2;
                case '-' -> randomNumb1 - randomNumb2;
                case '*' -> randomNumb1 * randomNumb2;
                default -> {
                    System.out.println("null");
                    yield 0;
                }
            };
            String answer = randomNumb1 + " " + operator + " " + randomNumb2;
            String correctAnswer = Integer.toString(resultCalc);

            String result = Engine.game(answer, correctAnswer);
            if (result.equals("Correct!")) {
                attempts++;
            } else {
                System.out.println(result);
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + Engine.getName() + '!');
        }
    }
}
