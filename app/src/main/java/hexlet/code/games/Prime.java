package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 80;
    private static final String EXERCISE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void runGame() {
        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            String answer = Integer.toString(number);

            String correctAnswer = Prime.isPrime(number) ? "yes" : "no";

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static boolean isPrime(int numb) {
        if (numb < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= numb / 2) {
            if (numb % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}

