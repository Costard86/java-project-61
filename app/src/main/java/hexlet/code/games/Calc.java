package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        int maxRandom = 20;
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        var attempts = 0;
        while (attempts < 3) {
            int randomNumb1 = 1 + (int) (Math.random() * maxRandom);
            int randomNumb2 = 1 + (int) (Math.random() * maxRandom);
            char[] operators = {'+', '-', '*'};
            int randomOperator = (int) (Math.random() * 3);
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
            System.out.println("Congratulations, " + Engine.name + '!');
        }
    }
}
