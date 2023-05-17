package hexlet.code.games;
import hexlet.code.Engine;

//import java.util.Scanner;

public class Progression {
    public static void progression() {
        int maxRandom = 10;
        int maxStep = 5;
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        var attempts = 0;
        while (attempts < 3) {
            int startElement = 1 + (int) (Math.random() * maxRandom);
            int step = 1 + (int) (Math.random() * maxStep);
            var progression = new String[10];

            for (var i = 0; i < progression.length; i++) {
                progression[i] = Integer.toString(startElement);
                startElement = startElement + step;
            }

            int randomMissElem = (int) (Math.random() * maxRandom);
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
