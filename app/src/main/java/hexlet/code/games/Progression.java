package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 10;
    private static final int MASSIVE_ELEMENTS = 10;
    private static final String EXERCISE = "What number is missing in the progression?";
    public static void progression() {
        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {

            var rowElements = Progression.rowElements();

            int randomMissElem = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER - 1);

            var temp = rowElements[randomMissElem];

            String answer = Progression.missElement(rowElements, randomMissElem);
            String correctAnswer = Integer.toString(Integer.parseInt(temp));

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static String[] rowElements() {
        int startElement = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        int step = Utils.generateNumber(MIN_NUMBER + 1, MAX_NUMBER);
        var progression = new String[MASSIVE_ELEMENTS];

        for (var i = 0; i < MASSIVE_ELEMENTS; i++) {
            progression[i] = Integer.toString(startElement);
            startElement = startElement + step;
        }
        return progression;
    }
    public static String missElement(String[] row, int position) {
        row[position] = "..";
        String masToString = "";
        for (var i = 0; i < MASSIVE_ELEMENTS; i++) {
            masToString = masToString + row[i] + " ";
        }
        return masToString;
    }
}
