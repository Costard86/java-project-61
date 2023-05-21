package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int ROUND_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final int MASSIVE_ELEMENTS = 10;
    public static void progression() {
        String exercise = "What number is missing in the progression?";
        var attempts = 0;
        String[][] questionsAndAnswers = new String[ROUND_COUNT][2];
        while (attempts < ROUND_COUNT) {
            int startElement = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int step = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            var progression = new String[MASSIVE_ELEMENTS];

            for (var i = 0; i < MASSIVE_ELEMENTS; i++) {
                progression[i] = Integer.toString(startElement);
                startElement = startElement + step;
            }

            int randomMissElem = (int) (Math.random() * MASSIVE_ELEMENTS);
            var temp = progression[randomMissElem];
            progression[randomMissElem] = "..";
            String masToString = "";
            for (var i = 0; i < MASSIVE_ELEMENTS; i++) {
                masToString = masToString + progression[i] + " ";
            }

            String answer = masToString;
            String correctAnswer = Integer.toString(Integer.parseInt(temp));

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, exercise);
    }
}
