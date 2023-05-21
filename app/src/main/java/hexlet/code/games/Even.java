package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int ROUND_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 20;
    public static void even() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var attempts = 0;
        String[][] questionsAndAnswers = new String[ROUND_COUNT][2];
        while (attempts < ROUND_COUNT) {
            int random = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            var correctAnswer = "";
            if (random % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            questionsAndAnswers[attempts][0] = String.valueOf(random);
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, exercise);
    }
}
