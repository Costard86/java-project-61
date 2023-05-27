package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;
    private static final String EXERCISE = "Find the greatest common divisor of given numbers.";
    public static void runGame() {

        var attempts = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUND_COUNT][2];
        while (attempts < Engine.ROUND_COUNT) {
            int randomNumb1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int randomNumb2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            String answer = randomNumb1 + " " + randomNumb2;

            int resultGcd = GCD.gcd(randomNumb1, randomNumb2);
            String correctAnswer = Integer.toString(resultGcd);

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, EXERCISE);
    }
    public static int gcd(int numb1, int numb2) {
        while (numb1 != 0 && numb2 != 0) {
            if (numb1 > numb2) {
                numb1 = numb1 % numb2;
            } else {
                numb2 = numb2 % numb1;
            }
        }
        return numb1 + numb2;
    }
}

