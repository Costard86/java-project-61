package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 20;
    private static final int MIN_NUMBER_OP = 0;
    private static final int MAX_NUMBER_OP = 2;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String EXERCISE = "What is the result of the expression?";
    public static void runGame() {
        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {
            int randomNumb1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int randomNumb2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int randomOperator = Utils.generateNumber(MIN_NUMBER_OP, MAX_NUMBER_OP);
            char operator = OPERATORS[randomOperator];
            String answer = randomNumb1 + " " + operator + " " + randomNumb2;

            int resultCalc = Calc.toCalc(randomNumb1, randomNumb2, operator);
            String correctAnswer = Integer.toString(resultCalc);

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static int toCalc(int num1, int num2, char operate) {
        int resultCalc = switch (operate) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("Unknown operator: " + operate);
        };
        return resultCalc;
    }
}
