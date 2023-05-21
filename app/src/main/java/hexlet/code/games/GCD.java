package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int ROUND_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 50;
    public static void gcd() {
        String exercise = "Find the greatest common divisor of given numbers.";
        var attempts = 0;
        String[][] questionsAndAnswers = new String[ROUND_COUNT][2];
        while (attempts < ROUND_COUNT) {
            int randomNumb1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int randomNumb2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            String answer = randomNumb1 + " " + randomNumb2;
            while (randomNumb1 != 0 && randomNumb2 != 0) {
                if (randomNumb1 > randomNumb2) {
                    randomNumb1 = randomNumb1 % randomNumb2;
                } else {
                    randomNumb2 = randomNumb2 % randomNumb1;
                }
            }
            int gcd = randomNumb1 + randomNumb2;

            String correctAnswer = Integer.toString(gcd);

            questionsAndAnswers[attempts][0] = answer;
            questionsAndAnswers[attempts][1] = correctAnswer;
            attempts++;
        }
        Engine.gameRun(questionsAndAnswers, exercise);
    }
}

