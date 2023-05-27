package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 10;
    private static final int MASSIVE_ELEMENTS = 10;
    private static final String EXERCISE = "What number is missing in the progression?";
    public static void runGame() {
        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {
            int first = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int step = Utils.generateNumber(MIN_NUMBER + 1, MAX_NUMBER);
            int randomMissElem = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER - 1);

            String[] progression = makeProgression(first, step, MASSIVE_ELEMENTS);

            String correctAnswer = progression[randomMissElem];
            progression[randomMissElem] = "..";
            String answer = String.join(" ", progression);

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static String[] makeProgression(int first, int step, int progressionLength) {
        var progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(first);
            first = first + step;
        }
        return progression;
    }
}
