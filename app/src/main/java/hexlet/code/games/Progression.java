package hexlet.code.games;
import hexlet.code.Engine;

//import java.util.Scanner;

public class Progression {
    private static final int ROUND_COUNT = 3;
    private static final int RANDOM_NUMBER = 10;
    private static final int RANDOM_STEP = 7;
    private static final int MASSIVE_ELEMENTS = 10;
    public static void progression() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        var attempts = 0;
        while (attempts < ROUND_COUNT) {
            int startElement = 1 + (int) (Math.random() * RANDOM_NUMBER);
            int step = 1 + (int) (Math.random() * RANDOM_STEP);
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

            String result = Engine.game(answer, correctAnswer);
            if (result.equals("Correct!")) {
                attempts++;
            } else {
                System.out.println(result);
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + Engine.getName() + '!');
        }
    }
}
