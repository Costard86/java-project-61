package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int ROUND_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 80;
    public static void prime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var attempts = 0;
        String[][] questionsAndAnswers = new String[ROUND_COUNT][2];
        while (attempts < ROUND_COUNT) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
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
            String answer = Integer.toString(number);
            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, exercise);
    }
}

