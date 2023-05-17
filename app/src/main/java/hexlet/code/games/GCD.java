package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        var attempts = 0;
        while (attempts < 3) {
            int randomNumb1 = 1 + (int) (Math.random() * 50);
            int randomNumb2 = 1 + (int) (Math.random() * 50);
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
