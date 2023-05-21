package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int ROUND_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 20;
    private static final int MIN_NUMBER_OP = 0;
    private static final int MAX_NUMBER_OP = 2;
    public static void calc() {
        String exercise = "What is the result of the expression?";
        var attempts = 0;
        String[][] questionsAndAnswers = new String[ROUND_COUNT][2];
        while (attempts < ROUND_COUNT) {
            int randomNumb1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int randomNumb2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            char[] operators = {'+', '-', '*'};
            int randomOperator = Utils.generateNumber(MIN_NUMBER_OP, MAX_NUMBER_OP);
            char operator = operators[randomOperator];

            int resultCalc = switch (operator) {
                case '+' -> randomNumb1 + randomNumb2;
                case '-' -> randomNumb1 - randomNumb2;
                case '*' -> randomNumb1 * randomNumb2;
                default -> throw new RuntimeException("Unknown operator: " + operator);
            };
            String answer = randomNumb1 + " " + operator + " " + randomNumb2;
            String correctAnswer = Integer.toString(resultCalc);

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, exercise);
    }
}
