package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;
    private static final String EXERCISE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void even() {

        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {
            int random = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            String correctAnswer = Even.isEven(random) ? "yes" : "no";
            questionsAndAnswers[attempts][0] = String.valueOf(random);
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
