package hexlet.code.games;
import hexlet.code.Engine;

//import java.util.Scanner;

public class Progression {
    public static void progression() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        var attempts = 0;
        while (attempts < 3) {
            int startElement = 1 + (int) (Math.random() * 10);
            int step = 1 + (int) (Math.random() * 7);
            var progression = new String[10];

            for (var i = 0; i < 10; i++) {
                progression[i] = Integer.toString(startElement);
                startElement = startElement + step;
            }

            int randomMissElem = (int) (Math.random() * 10);
            var temp = progression[randomMissElem];
            progression[randomMissElem] = "..";
            String masToString = "";
            for (var i = 0; i < 10; i++) {
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
            System.out.println("Congratulations, " + Engine.name + '!');
        }
    }
}
